package ejercicios.vehicles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Fase1_2_3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to create a bike or a car?");
        String typeVehicle = input.nextLine().trim();
        if (!typeVehicle.toLowerCase().equals("car") && !typeVehicle.toLowerCase().equals("bike")) {
            System.out.println("The only allowed type of vehicles are cars or bikes");
            return;
        }
        System.out.println("What´s plate would you like to have?");
        String plate = input.nextLine().trim();
        if (!isCorrectPlate(plate)) {
            System.out.println("The plate has to contain 4 numbers and 2 or 3 characters");
            return;
        }
        System.out.println("What´s brand would you like to have?");
        String brand = input.nextLine().trim();
        System.out.println("What´s color would you like to have?");
        String color = input.nextLine().trim();

        boolean isCar = typeVehicle.toLowerCase().equals("car");
        Vehicle vehicle = isCar?new Car(plate, brand, color):new Bike(plate, brand, color);
        List<Wheel> frontWheels = null, backWheels = null;
        for (int i=0; i<2; i++) {
            String frontOrBack = i==0?"front":"back";
            List<Wheel> wheels;
            if (isCar) {
                Wheel rightWheel = askForWheelDataAndConstructWheel(input, "Introduce the brand and diameter of the "+frontOrBack+" right wheel");
                Wheel leftWheel = askForWheelDataAndConstructWheel(input, "Introduce the brand and diameter of the "+frontOrBack+" left wheel");
                wheels = Arrays.asList(rightWheel, leftWheel);
            }
            else {
                Wheel wheel = askForWheelDataAndConstructWheel(input, "Introduce the brand and diameter of the "+frontOrBack+" wheel");
                wheels = Arrays.asList(wheel);
            }
            if (i==0) frontWheels = wheels;
            else backWheels = wheels;
        }
        try {
            vehicle.addWheels(frontWheels, backWheels);
        }
        catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    private static Wheel askForWheelDataAndConstructWheel (Scanner input, String askMessage) {
        System.out.println(askMessage);
        String s = input.nextLine().trim();
        String ts[] = s.split(",");
        if (ts.length!=2) {
            throw new RuntimeException("Incorrect data");
        }
        return new Wheel(ts[0].trim(), Double.parseDouble(ts[1].trim()));
    }

    private static boolean isCorrectPlate (String plate) {
        if (plate.length()<6 || plate.length()>7) return false;
        final String pattern = "[0-9]{4}[a-zA-Z]{2,3}";
        return plate.matches(pattern);
    }

    private static boolean isCorrectWheelDiameter (double diameter) {
        return diameter>0.4 && diameter<4;
    }
}
