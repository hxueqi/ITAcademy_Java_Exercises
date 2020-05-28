package ejercicios.ciudades;

import java.util.Scanner;

public class Fase4 {
    public static void main(String[] args) {
        //Create 6 empty city string
        String ciudad1;
        String ciudad2;
        String ciudad3;
        String ciudad4;
        String ciudad5;
        String ciudad6;

        //Get 6 cities' names from user
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el nombre de 6 ciudades, una por línea:");
        ciudad1 = input.nextLine();
        ciudad2 = input.nextLine();
        ciudad3 = input.nextLine();
        ciudad4 = input.nextLine();
        ciudad5 = input.nextLine();
        ciudad6 = input.nextLine();

        String[] arrayCiudades = {ciudad1, ciudad2, ciudad3, ciudad4, ciudad5, ciudad6};
        for(int i = 0; i< arrayCiudades.length; i++) {
            char[] ciudadNew = creaArrayCiudad(arrayCiudades[i]);
            char[] ciudadNewReserve = creaReverseCiudad(ciudadNew);
            System.out.println(ciudadNewReserve);
        }
    }

    private static char[] creaArrayCiudad(String ciudad) {
        char[] ciudadNew = new char[ciudad.length()];
        for(int i = 0; i < ciudad.length(); i++){
            ciudadNew[i] = ciudad.charAt(i);
        }
        return ciudadNew;
    }

    private static char[] creaReverseCiudad(char[] ciudad) {
        char[] ciudadReverse = new char[ciudad.length];
        for(int i = 0; i < ciudad.length; i++){
            ciudadReverse[i] = ciudad[ciudad.length-i-1];
        }
        return ciudadReverse;
    }


}


