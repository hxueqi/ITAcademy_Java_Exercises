package ejercicios.ciudades;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Fase2 {
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

        ArrayList<String> arrayCiudades= new ArrayList<String>();
        arrayCiudades.add(ciudad1);
        arrayCiudades.add(ciudad2);
        arrayCiudades.add(ciudad3);
        arrayCiudades.add(ciudad4);
        arrayCiudades.add(ciudad5);
        arrayCiudades.add(ciudad6);

        Collections.sort(arrayCiudades);
        System.out.println(arrayCiudades);
    }
}
