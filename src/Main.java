import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the measured temperature in Celsius:");
        Scanner scanner = new Scanner(System.in);
        List<Integer> listOfTemperatures = new ArrayList<Integer>();
        while (true) {
            int temperature = scanner.nextInt();
            listOfTemperatures.add(temperature);

            //sum of all entered temperatures should be divided by the number of entries
            double sum = 0;
            for (int i = 0; i < listOfTemperatures.size(); i++) {
                sum = sum + listOfTemperatures.get(i);
            }
            double averageTemperature = sum / listOfTemperatures.size();
            System.out.println("The average temperature is " + averageTemperature + " degrees Celsius");

            int indexOfPreviousNumber = listOfTemperatures.size() - 2;
            if (listOfTemperatures.size() >= 2) {
                int valueOfPreviousNumber = listOfTemperatures.get(indexOfPreviousNumber);
                double difference = temperature - valueOfPreviousNumber;
                System.out.println("The difference with the previous entry is " + difference + " degrees Celsius");

                if (temperature > averageTemperature * 1.1 && temperature > valueOfPreviousNumber * 1.2) {
                    System.out.println("Alarm! The temperature is approaching dangerous levels!!!");
                }
            }
        }
    }
}

