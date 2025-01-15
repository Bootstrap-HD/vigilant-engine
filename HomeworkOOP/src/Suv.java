public class Suv extends Car {
    public double bodyHeight;

    public Suv (String brand,String model,int numberOfSeat,int enginePower,double engineDisplacement, double bodyHeight) {
        this.brand = brand;
        this.model = model;
        this.numberOfSeat = numberOfSeat;
        this.enginePower = enginePower;
        this.engineDisplacement = engineDisplacement;
        this.bodyHeight = bodyHeight;
    }

    public Suv() {}

    @Override
    public String drive() {
        return String.format("Vrooom. drrr vroom.,black smoke from the exhaust pipe, come sit in my %s %s ", brand,model);
    }

    public double getBodyHeight() {
        return bodyHeight;
    }

    public void setBodyHeight(double bodyHeight) {
        this.bodyHeight = bodyHeight;
    }

    @Override
    public String outputInfo() {
        return super.outputInfo() + String.format("\nBody height: %f \n", bodyHeight);
    }
}
