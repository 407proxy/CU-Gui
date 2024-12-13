package cu;

abstract class Credentials {
    abstract String getName();
    abstract int getAge();
    abstract int getDrivingExperience();
    abstract String getPlateNumber();
    abstract String getCarModel();
    abstract int getCarAge();
    abstract int getAccidentHistory();
    abstract int getInsuranceID();
    abstract void setInsuranceID(int A);

}

public class Gui_Customer extends Credentials{
    private String name;
    private int age;
    private int drivingExperience;
    private String plateNumber;
    private String carModel;
    private int carAge;
    private int accidentHistory;
    private int insuranceID;
    Gui_Customer(String firstName, String lastName, int age, int drivingExperince, String plateNumber, String carModel, int carAge, int accidentHistory){
        this.name = (firstName + " " + lastName);
        this.age = age;
        this.drivingExperience = drivingExperince;
        this.plateNumber = plateNumber;
        this.carModel = carModel;
        this.carAge = carAge;
        this.accidentHistory = accidentHistory;
    }
    Gui_Customer(int insuranceID, String plateNumber, String carModel, int carAge, int accidentHistory, int drivingExperince){
        this.insuranceID = insuranceID;
        this.plateNumber = plateNumber;
        this.carModel = carModel;
        this.carAge = carAge;
        this.accidentHistory = accidentHistory;
        this.drivingExperience = drivingExperince;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getCarAge() {
        return carAge;
    }

    public int getAccidentHistory() {
        return accidentHistory;
    }

    public int getInsuranceID() {
        return insuranceID;
    }

    public void setInsuranceID(int insuranceID) {
        this.insuranceID = insuranceID;
    }

    public static void main(String[] args){
    
    }
}