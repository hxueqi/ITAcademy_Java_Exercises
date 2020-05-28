package ejercicios.ciudades;

import java.util.Arrays;
import java.util.Scanner;

public class Fase3 {
    public static void main(String[] args) {
        String ciudad1;
        String ciudad2;
        String ciudad3;
        String ciudad4;
        String ciudad5;
        String ciudad6;

        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el nombre de 6 ciudades, una por línea:");
        ciudad1 = input.nextLine();
        ciudad2 = input.nextLine();
        ciudad3 = input.nextLine();
        ciudad4 = input.nextLine();
        ciudad5 = input.nextLine();
        ciudad6 = input.nextLine();

        //Put all the cities in an array
        String[] arrayCiudades = {ciudad1, ciudad2, ciudad3, ciudad4, ciudad5, ciudad6};
        String[] arrayCiudadesModificadas = new String[arrayCiudades.length];

        //Loop through the cities
        for(int i = 0; i < arrayCiudades.length; i++){
            // Modify them according to the exercise request
            // Store them on the new array
            arrayCiudadesModificadas[i] = modificaCiudad(arrayCiudades[i]);
        }

        //Sort the modified cities
        Arrays.sort(arrayCiudadesModificadas);

        //Print result
        for(int i = 0; i < arrayCiudadesModificadas.length; i++) {
            System.out.println(arrayCiudadesModificadas[i]);
        }
    }


    private static String modificaCiudad(String ciudad) {
        return ciudad.replaceAll("a", "4");
    }
}
