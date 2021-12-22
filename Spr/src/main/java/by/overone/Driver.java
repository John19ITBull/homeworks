package by.overone;

public class Driver {
    private Sound sound;
    private String name;
    private String drivingLicenseCategory;

    public Driver() {
    }


    public Driver(Sound sound) {
        System.out.println("Driver wants to ride");
        this.sound = sound;
    }

    public Sound getSound() {
        return sound;
    }

    public void setSound(Sound sound) {
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDrivingLicenseCategory() {
        return drivingLicenseCategory;
    }

    public void setDrivingLicenseCategory(String drivingLicenseCategory) {
        this.drivingLicenseCategory = drivingLicenseCategory;
    }

    public void startingCar() {
        System.out.println("Starting the car");
        sound.sound();
    }

}
