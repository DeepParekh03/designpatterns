package tech.zeta.java.designpatterns.behavioral.command;

public class Light {
    public void turnOn(){
        System.out.println("Light is on!");
    }

    public void turnOff(){
        System.out.printf("Light is Off! %n");
    }

    public static class TurnOnCommand implements Command {
        @Override
        public void execute() {

        }
    }
}
