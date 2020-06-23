package ejercicios.variables;

public class Fase2 {
    public static void main(String[] args){
        //Creeu una constant amb el valor de l’any (1948).
        final int YEAR_ORIGIN = 1948;

        //Creeu una variable que guardi cada quan hi ha un any de traspàs.
        int leapYear = 0;

        //Calculeu quants anys de traspàs hi ha entre 1948 i el vostre any de naixement i emmagatzemeu el valor resultant en una variable.
        for(int i= YEAR_ORIGIN; i<=1991;i++){
            if((i % 4 == 0) && (i % 100 != 0) || (i % 400 == 0)){
               leapYear++;
            }
        }

        //Mostreu per pantalla el resultat del càlcul.
        System.out.println("Here are "+ leapYear+ " leap years between 1948 and my birth year");
    }
}
