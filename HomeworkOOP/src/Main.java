public class Main {
    public static void main(String[] args) {
        Car honda = new Car("Honda", "Civic", 4, 160, 2.0);
        Car mercedes = new Car("Mercedes", "C-AMG", 2,630, 4.0);
        Car audi = new Car("Audi", "A-8",5,400,4.2);

        System.out.println(honda.outputInfo());
        System.out.println(mercedes.outputInfo());
        System.out.println(audi.outputInfo());
        System.out.println(honda.drive());
    }

}