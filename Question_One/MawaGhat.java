class Resort {
    private String name;
    private String location;
    private double areaSize;

    public Resort(String name, String location, double areaSize) {
        this.name = name;
        this.location = location;
        this.areaSize = areaSize;
    }

    public void display() {
        System.out.println("Name: " + name + "\n" +"Location: " + location + "\n" +"Area Size: " + areaSize);
    }
}

class Terminal {
    private String type;
    private String nameOrNumber;
    private int noOfHotel;
    private int noOfVehicle;
    private String operation;

    public Terminal(String type, String nameOrNumber, int noOfHotel, int noOfVehicle, String operation) {
        this.type = type;
        this.nameOrNumber = nameOrNumber;
        this.noOfHotel = noOfHotel;
        this.noOfVehicle = noOfVehicle;
        this.operation = operation;
    }

    public void display() {
        System.out.println("Type: " + type + "\n" + "Name/Number: " + nameOrNumber + "\n" +"No. of Hotels: " + noOfHotel
                +"\n" + "No. of Vehicles: " + noOfVehicle + "\n" +"Operation: " + operation);
    }
}

public class MawaGhat {
    private String type;
    private String nameOrNumber;
    private int noOfHotel;
    private int noOfVehicle;
    private Resort resort;
    private Terminal terminal;

    public MawaGhat(String type, String nameOrNumber, int noOfHotel, int noOfVehicle, Resort resort,
            Terminal terminal) {
        this.type = type;
        this.nameOrNumber = nameOrNumber;
        this.noOfHotel = noOfHotel;
        this.noOfVehicle = noOfVehicle;
        this.resort = resort;
        this.terminal = terminal;
    }

    public void display() {
        System.out.println("Type: " + type + "\n" +"Name/Number: " + nameOrNumber + "\n" +"No. of Hotels: " + noOfHotel
                + "\n" +"No. of Vehicles: " + noOfVehicle);
        resort.display();
        terminal.display();
    }
    public static void main(String[] args) {
        MawaGhat mawaGhat = new MawaGhat("Ferry terminal", "Mawa Ghat", 10, 20, 
                                    new Resort("Riverview Resort", "Mawa Ghat", 10000),
                                    new Terminal("Ferry terminal", "Mawa Terminal", 5, 10, "Operational"));
        mawaGhat.display();
    }
}
