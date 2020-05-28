package ejercicios.variables;

public class Fase3 {
    public static void main(String[] args){
        int year = 1948;
        int birthYear = 1991;
        String answerToTrue = "Your birth year is leap year";
        String answerToFlase = "Your birth year is not leap year";

        for(; year<=1991; year++){
            if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
                System.out.println(year);
            }
        }

        boolean isLeapYear;
        if ((birthYear % 4 == 0) && (birthYear % 100 != 0) || (birthYear % 400 == 0)) isLeapYear = true;
        else isLeapYear = false;

        if(isLeapYear){
            System.out.println(answerToTrue);
        }
        else{
            System.out.println(answerToFlase);
        }

    }
}
