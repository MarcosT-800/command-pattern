// main/Demo.java
package main;

import commands.TurnOnLightCommand;
import commands.TurnOffLightCommand;
import devices.Light;
import invoker.RemoteControl;

public class Demo {
    public static void main(String[] args) {
        Light light = new Light();
        Command turnOn = new TurnOnLightCommand(light);
        Command turnOff = new TurnOffLightCommand(light);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(turnOn);
        remote.pressButton(); // A lâmpada está ligada.

        remote.setCommand(turnOff);
        remote.pressButton(); // A lâmpada está desligada.
    }
}