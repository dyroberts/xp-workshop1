package io.pivotal.smarthome;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SmartHomeTest {

    @Test
    public void shouldTurnTheBulbOnWhenTheSwitchIsOn() {
        Switch alwaysOnSwitch = () -> true;
        SwitchableSpy switchableSpy = new SwitchableSpy();
        new SmartHome().run(alwaysOnSwitch, switchableSpy);

        assertTrue("turn on should have been called", switchableSpy.turnOnWasCalled());
    }

    private class SwitchableSpy implements Switchable {
        boolean turnOnWasCalled = false;

        @Override
        public void turnOn() {
            turnOnWasCalled = true;
        }

        @Override
        public void turnOff() {

        }

        public boolean turnOnWasCalled() {
            return turnOnWasCalled;
        }
    }
}
