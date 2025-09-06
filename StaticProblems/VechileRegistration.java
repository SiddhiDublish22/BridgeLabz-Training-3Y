package StaticProblems;

public class VechileRegistration {
    private static double registrationFee = 500.00;

    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    public VechileRegistration(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Updated Registration Fee: $" + registrationFee);
    }

    public void displayRegistrationDetails() {
        if (this instanceof VechileRegistration) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: $" + registrationFee);
        } else {
            System.out.println("Invalid vehicle instance.");
        }
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public static void main(String[] args) {
        VechileRegistration v1 = new VechileRegistration("Nikhil Sharma", "Car", "REG12345");
        VechileRegistration v2 = new VechileRegistration("Anita Roy", "Motorcycle", "REG67890");

        System.out.println("\nVehicle 1 Registration Details:");
        v1.displayRegistrationDetails();

        System.out.println("\nVehicle 2 Registration Details:");
        v2.displayRegistrationDetails();

        VechileRegistration.updateRegistrationFee(600.00);

        System.out.println("\nVehicle 1 Details After Fee Update:");
        v1.displayRegistrationDetails();
    }
}