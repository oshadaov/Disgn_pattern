// Command Interface
interface Command {
    void execute();
}

// Receiver Classes
class Light {
    void on() {
        System.out.println("Light is ON");
    }

    void off() {
        System.out.println("Light is OFF");
    }
}

class GarageDoor {
    void open() {
        System.out.println("Garage Door is OPEN");
    }

    void close() {
        System.out.println("Garage Door is CLOSED");
    }
}

// Concrete Command Classes
class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}

class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}

class GarageDoorOpenCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.open();
    }
}

class GarageDoorCloseCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.close();
    }
}

// Invoker Class
class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}

// Client
class CommandPatternDemo {
    public static void main(String[] args) {
        // Receivers
        Light livingRoomLight = new Light();
        GarageDoor garageDoor = new GarageDoor();

        // Commands
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);
        Command garageOpen = new GarageDoorOpenCommand(garageDoor);
        Command garageClose = new GarageDoorCloseCommand(garageDoor);

        // Invoker
        RemoteControl remote = new RemoteControl();

        // Execute commands
        remote.setCommand(lightOn);
        remote.pressButton();

        remote.setCommand(lightOff);
        remote.pressButton();

        remote.setCommand(garageOpen);
        remote.pressButton();

        remote.setCommand(garageClose);
        remote.pressButton();
    }
}
