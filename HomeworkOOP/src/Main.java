import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Coupe coupe = new Coupe();
        Suv suv = new Suv("Mercedes", "C-AMG", 2,630, 4.0, 2.2);

        int n;

        do {
            System.out.println("Выбрать (0 - выход. 1 - добавить/изменить. 2 - вывести. 3 - ехать");
            n = scanner.nextInt();

            switch (n) {

                case 0 -> System.out.println("Выход");
                case 1 -> {
                    System.out.println("Выбор авто (1 - Coupe; 2 - Suv): ");

                    int typeCar = scanner.nextInt();

                    if (typeCar == 1) {
                        writeInfoForCoupe(coupe);
                    }

                    if (typeCar == 2)
                        writeInfoForSuv(suv);
                }
                case 2 -> {
                    System.out.println("Выбор авто (1 - Coupe. 2 - Suv): ");

                    System.out.println(scanner.nextInt() == 1 ? coupe.outputInfo() : suv.outputInfo());
                }
                case 3 -> {
                    System.out.println("Выбор авто (1 - Coupe. 2 - Suv): ");

                    System.out.println(scanner.nextInt() == 1 ? coupe.drive() : suv.drive());
                }
            }
        } while (n != 0);
    }

    public static Coupe writeInfoForCoupe(Coupe coupe) {

        if (coupe.getModel() == null) {
            System.out.println("Print Model");
            coupe.setModel(scanner.next());
        }
        else {
            System.out.println("Изменить модель (1 - Да; 2 - Нет): ");
            if (scanner.nextInt() == 1) {
                System.out.println("Print Model");
                coupe.setModel(scanner.next());
            }
        }

        System.out.println("Print Brand");
        coupe.setBrand(scanner.next());

        System.out.println("Print Engine power");
        coupe.setEnginePower(scanner.nextInt());

        System.out.println("Print Engine displacement");
        coupe.setEngineDisplacement(scanner.nextDouble());

        coupe.setNumberOfSeat(2);
        coupe.setNumbersOfDoors(2);

        return coupe;
    }

    public static Suv writeInfoForSuv(Suv suv) {

        System.out.println("Print Model");
        suv.setModel(scanner.next());

        System.out.println("Print Brand");
        suv.setBrand(scanner.next());

        System.out.println("Print Engine power");
        suv.setEnginePower(scanner.nextInt());

        System.out.println("Print Engine displacement");
        suv.setEngineDisplacement(scanner.nextDouble());

        suv.setNumberOfSeat(2);
        suv.setBodyHeight(2.2);

        return suv;
    }
}