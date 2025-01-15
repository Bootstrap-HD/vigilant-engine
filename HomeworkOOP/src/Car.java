public class Car {
    public String brand;
    public String model;
    public int numberOfSeat;
    public int enginePower;
    public double engineDisplacement;

    public String outputInfo() {
        return String.format("Brand: %s \nModel: %s \nNumber of seat: %d \nEngine power: %d \nEngine displacement: %.1f",
           brand, model, numberOfSeat, enginePower, engineDisplacement);
    }

    public String drive() {
        return String.format("Vrooom.., come sit in my %s %s ", brand,model);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumberOfSeat() {
        return numberOfSeat;
    }

    public void setNumberOfSeat(int numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public double getEngineDisplacement() {
        return engineDisplacement;
    }

    public void setEngineDisplacement(double engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }
}

