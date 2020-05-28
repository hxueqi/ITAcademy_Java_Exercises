package ejercicios.letrasrepetidas;

import java.util.ArrayList;
import java.util.List;

public class Fase4 {
    public static void main(String[] args) {
        //Store characters of a surname in a list
        List<Character> surname = new ArrayList<>();
        surname.add('H');
        surname.add('u');
        surname.add('a');
        surname.add('n');
        surname.add('g');

        //Store characters of a name in a list
        List<Character> name = new ArrayList<>();
        name.add('X');
        name.add('u');
        name.add('e');
        name.add('q');
        name.add('i');

        //Store characters of a full name in a list
        List<Character> fullName = new ArrayList<>();
        fullName.addAll(name);
        fullName.add(' ');
        fullName.addAll(surname);

        System.out.println(fullName);
    }
}
