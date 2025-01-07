public class Coupe extends Car {
    public int numbersOfDoors;

    public Coupe (String brand, String model, int numberOfSeat, int enginePower, double engineDisplacement, int numbersOfDoors) {
        this.brand = brand;
        this.model = model;
        this.numberOfSeat = numberOfSeat;
        this.enginePower = enginePower;
        this.engineDisplacement = engineDisplacement;
        this.numbersOfDoors = numbersOfDoors;
    }

    public Coupe() {}

    @Override
    public String drive() {
        return String.format("Vrooom.., drift sound, come sit in my %s %s ", brand,model);
    }

    public void setNumbersOfDoors(int newNumbersOfDoors) {
        this.numbersOfDoors = newNumbersOfDoors;
    }

    public int getNumbersOfDoors() {
        return numbersOfDoors;
    }

    @Override
    public String outputInfo() {
        return super.outputInfo() + String.format("\nNumbersOfDoors: %d \n", numbersOfDoors);
    }

}
