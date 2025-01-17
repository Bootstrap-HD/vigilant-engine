import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int n;
        ArrayList<Car> cars = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String filePath = "Homework.txt";
        FileWriter fileWriter = new FileWriter(filePath, true);
        File file = new File(filePath);
        Scanner scannerFromFile = new Scanner(file);

        while (scannerFromFile.hasNext()) {
            String stringCar = scannerFromFile.nextLine();
            String[] parsedCar = stringCar.split("~");
            if (parsedCar[0].equals("Coupe")) {
                cars.add(new Coupe(parsedCar[1], parsedCar[2], Integer.parseInt(parsedCar[3]), Integer.parseInt(parsedCar[4]),
                        Double.parseDouble(parsedCar[5]), Integer.parseInt(parsedCar[6])));
            } else if (parsedCar[0].equals("Suv")) {
                cars.add(new Suv(parsedCar[1], parsedCar[2], Integer.parseInt(parsedCar[3]), Integer.parseInt(parsedCar[4]),
                        Double.parseDouble(parsedCar[5]), Double.parseDouble(parsedCar[6])));
            }
        }

        do {
            System.out.print("Select an action (0 - Exit. 1 - Add car. 2 - Output cars): ");
            n = scanner.nextInt();

            switch (n) {
                case 0:
                    System.out.println("Exit...");
                    break;
                case 1:
                    System.out.print("Select a car (1 - Coupe. 2 - Suv): ");
                    int a = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter brand: ");
                    String valueBrand = scanner.nextLine();
                    System.out.print("Enter model: ");
                    String valueModel = scanner.nextLine();
                    System.out.print("Enter number of seat: ");
                    int valueNumberOfSeat = scanner.nextInt();
                    System.out.print("Enter horse power: ");
                    int valueHorsePower = scanner.nextInt();
                    System.out.print("Enter engine capacity: ");
                    double valueEngineCapacity = scanner.nextDouble();
                    scanner.nextLine();

                    if (a == 1) {
                        System.out.print("Enter numbers of doors: ");
                        int valueNumbersOfDoors = scanner.nextInt();
                        cars.add(new Coupe(valueBrand, valueModel, valueNumberOfSeat, valueHorsePower,
                                valueEngineCapacity, valueNumbersOfDoors));
                        fileWriter.write("\nCoupe" + "~" + valueBrand + "~" + valueModel + "~" + valueNumberOfSeat
                                + "~" + valueHorsePower + "~" + valueEngineCapacity + "~" + valueNumbersOfDoors);
                    } else if (a == 2) {
                        System.out.print("Enter body height: ");
                        double valueBodyHeight = scanner.nextDouble();
                        cars.add(new Suv(valueBrand, valueModel, valueNumberOfSeat, valueHorsePower,
                                valueEngineCapacity, valueBodyHeight));
                        fileWriter.write("\nSuv" + "~" + valueBrand + "~" + valueModel + "~" + valueNumberOfSeat
                                + "~" + valueHorsePower + "~" + valueEngineCapacity + "~" + valueBodyHeight);
                    }
                    break;
                case 2:
                    for (Car car : cars) {
                        System.out.println(car.outputInfo());
                    }
                    break;
                default:
                    System.out.println("There is no such action!");
                    break;
            }
        } while (n != 0);

        fileWriter.close();
    }
}
