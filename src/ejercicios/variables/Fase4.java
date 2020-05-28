package ejercicios.variables;
import java.util.Scanner;

public class Fase4 {
    public static void main(String[] args){
        Scanner input1 = new Scanner(System.in);
        System.out.println("Please input your name and surname:");
        String name = input1.nextLine();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Please input your day of birth");
        int day = input2.nextInt();

        Scanner input3 = new Scanner(System.in);
        System.out.println("Please input your month of birth");
        int month = input3.nextInt();

        Scanner input4 = new Scanner(System.in);
        System.out.println("Please input your year of birth");
        int year = input4.nextInt();

        String birthday = day+"/"+month+"/"+year;

        System.out.println("My name is " + name);
        System.out.println("I was born in " + birthday);

        boolean isLeapYear;
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) isLeapYear = true;
        else isLeapYear = false;

        if(isLeapYear){
            System.out.println("My birth year is leap year");
        }
        else{
            System.out.println("My birth year is not leap year");
        }
    }
}
