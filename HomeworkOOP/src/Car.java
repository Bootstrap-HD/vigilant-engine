public class Car {
    public String brand;
    public String model;
    public int numberOfSeat;
    public int horsPower;
    public double engineCapacity;

    public Car(String brand,String model,int numberOfSeat,int horsPower,double engineCapacity) {
        this.brand = brand;
        this.model = model;
        this.numberOfSeat = numberOfSeat;
        this.horsPower = horsPower;
        this.engineCapacity = engineCapacity;

    }

    public String outputInfo() {
        return String.format("Brand: %s \nModel: %s \nNumber of seat: %d \nHors power: %d \nEngine capacity: %.1f",
           brand, model, numberOfSeat, horsPower, engineCapacity );

    }

    public String drive() {
        return String.format("Vrooom.., come sit in my %s %s ", brand,model);
    }
}

