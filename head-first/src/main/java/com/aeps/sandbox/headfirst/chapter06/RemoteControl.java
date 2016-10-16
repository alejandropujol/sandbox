package com.aeps.sandbox.headfirst.chapter06;

/**
 * Created by Alejandro on 10/16/2016.
 */
public class RemoteControl {

    private Command[] onCommands;

    private Command[] offCommands;

    private Command lastCommand;

    public RemoteControl() {
        onCommands = new Command[5];
        offCommands = new Command[5];

        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }

        Light light1 = new Light("Kitchen");
        onCommands[0] = new LightOnCommand(light1);
        offCommands[0] = new LightOffCommand(light1);

        Light light2 = new Light("Bedroom");
        onCommands[1] = new LightOnCommand(light2);
        offCommands[1] = new LightOffCommand(light2);

        onCommands[2] = new MacroCommand(new Command[] {onCommands[0], onCommands[1]});
        offCommands[2] = new MacroCommand(new Command[] {offCommands[0], offCommands[1]});
    }

    public void pushOnButton(int slot) {
        onCommands[slot].execute();
        lastCommand = onCommands[slot];
    }

    public void pushOffButton(int slot) {
        offCommands[slot].execute();
        lastCommand = offCommands[slot];
    }

    public void pushUndoButton() {
        lastCommand.undo();
    }

}