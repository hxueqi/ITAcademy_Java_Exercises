package ejercicios.variables;

public class Fase2 {
    public static void main(String[] args){
        final int YEAR_ORIGIN = 1948;
        int leapYear = 0;
        for(int i= YEAR_ORIGIN; i<=1991;i++){
            if((i % 4 == 0) && (i % 100 != 0) || (i % 400 == 0)){
               leapYear++;
            }
        }
        System.out.println("Here are "+ leapYear+ " leap years between 1948 and my birth year");
    }
}
