package ejercicios.variables;
import java.util.Scanner;

public class Fase4 {
    public static void main(String[] args){

        //Creeu una variable on juntareu el nom i els cognoms (tot en una variable)
        Scanner input1 = new Scanner(System.in);
        System.out.println("Please input your name and surname:");
        String name = input1.nextLine();

        //Un altre on juntareu la data de naixement separada per “/” (tot en una variable). Mostreu per consola les variables del nom complet
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

        //la data de naixement i si l’any de naixement es de traspàs o no.
        if(isLeapYear){
            System.out.println("My birth year is leap year");
        }
        else{
            System.out.println("My birth year is not leap year");
        }
    }
}
