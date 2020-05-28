package ejercicios.letrasrepetidas;

import java.util.ArrayList;
import java.util.List;

public class Fase2 {
    public static void main(String[] args){
        //Store characters of a name into a list
        List<Character> nombre = new ArrayList<>();
        nombre.add('X');
        nombre.add('u');
        nombre.add('e');
        nombre.add('q');
        nombre.add('i');

        //Store characters of vocales into a list
        List<Character> vocales = new ArrayList<>();
        vocales.add('a');
        vocales.add('e');
        vocales.add('i');
        vocales.add('o');
        vocales.add('u');
        vocales.add('A');
        vocales.add('E');
        vocales.add('I');
        vocales.add('O');
        vocales.add('U');

        //Store characters of numeros into a list
        List<Character> numeros = new ArrayList<>();
        numeros.add('1');
        numeros.add('2');
        numeros.add('3');
        numeros.add('4');
        numeros.add('5');
        numeros.add('6');
        numeros.add('7');
        numeros.add('8');
        numeros.add('9');
        numeros.add('0');

        //Check those characters of a name are vacales, number or constante
        for(int i=0;i<nombre.size();i++) {
            if (vocales.contains(nombre.get(i))) {
                System.out.println("VOCAL");
            }
            else if(numeros.contains((nombre.get(i)))){
                System.out.println("El nombre no puede contener numeros.");
            }
            else{
                System.out.println("CONSONTANTE");
            }
        }
    }
}
