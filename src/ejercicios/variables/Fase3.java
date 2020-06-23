package ejercicios.variables;

public class Fase3 {
    public static void main(String[] args){
        int year = 1948;
        int birthYear = 1991;

        //Creeu dues variables string per guardar les frases.
        String answerToTrue = "Your birth year is leap year";
        String answerToFlase = "Your birth year is not leap year";

        //Partint de l’any 1948 heu de fer un bucle for i mostrar els anys de traspàs fins arriba al vostre any de naixement.
        for(; year<=1991; year++){
            if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
                System.out.println(year);
            }
        }

        //Creeu una variable bool que sera certa si l’any de naixement és de traspàs o falsa si no ho és.
        boolean isLeapYear;
        if ((birthYear % 4 == 0) && (birthYear % 100 != 0) || (birthYear % 400 == 0)) isLeapYear = true;
        else isLeapYear = false;

        //En cas de que la variable bool sigui certa, heu de mostrar per consola una frase on ho digui, en cas de ser falsa mostrareu la frase pertinent.
        if(isLeapYear){
            System.out.println(answerToTrue);
        }
        else{
            System.out.println(answerToFlase);
        }

    }
}
