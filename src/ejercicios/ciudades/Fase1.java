package ejercicios.ciudades;

import java.util.Scanner;

public class Fase1 {
    public static void main(String[] args){
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

        System.out.println(ciudad1+", "+ciudad2+", "+ciudad3+", "+ciudad4+", "+ciudad5+", "+ciudad6);
    }

}
