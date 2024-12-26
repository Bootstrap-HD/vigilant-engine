public class Main {
    public static void main(String[] args) {
        Car carOne = new Car("Honda", "Civic", 4, 160, 2.0);
        Car carTwo = new Car("Mercedes", "C-AMG", 2,630, 4.0);
        Car carThree = new Car("Audi", "A-8",5,400,4.2);
        System.out.println(carOne.outputInfo());
        System.out.println(carTwo.outputInfo());
        System.out.println(carThree.outputInfo());
        System.out.println(carOne.drive());
    }

}