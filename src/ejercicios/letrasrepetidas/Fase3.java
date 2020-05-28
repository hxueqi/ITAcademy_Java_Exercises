package ejercicios.letrasrepetidas;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Fase3 {
    public static void main(String[] args){
        //Create a map of characters and integers
        Map<Character, Integer> mapCaracterVeces = new HashMap<>();

        //Store characters of a name into a list
        List<Character> nombre = new ArrayList<>();
        nombre.add('X');
        nombre.add('u');
        nombre.add('e');
        nombre.add('q');
        nombre.add('i');
        nombre.add('H');
        nombre.add('u');
        nombre.add('a');
        nombre.add('n');
        nombre.add('g');

        //Store those characters and times that appear into the map
        for(int i=0; i<nombre.size(); i++){
            Character c = nombre.get(i);
            if(mapCaracterVeces.containsKey(c)){
                Integer veces = mapCaracterVeces.get(c);
                mapCaracterVeces.put(c, veces+1);
            }
            else{
                mapCaracterVeces.put(c, 1);
            }
        }

        //Print the result
        for(int i=0; i<nombre.size(); i++){
            Character c = nombre.get(i);
            System.out.println("Character is: "+(c)+". The times of appearance is: "+ mapCaracterVeces.get(c));
        }
    }
}
