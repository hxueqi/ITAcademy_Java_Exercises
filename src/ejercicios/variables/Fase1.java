package ejercicios.variables;

public class Fase1 {
    public static void main(String[] args){
        //Crea tres variables string e inicialitzales amb les dades pertinents (nom, cognom1, cognom2).
        String name = "Xueqi";
        String surname1 = "Huang";
        String surname2 = "Josefa";

        //Crea tres variables int e inicialitzales amb les dades pertinents (dia, mes, any)
        int date = 20;
        int month = 4;
        int year = 2020;

        //Mostra per pantalla les variables string concatenant-les en aquest ordre (cognom1 + cognom2, + nom) i les variables int
        System.out.println(name+surname1+surname2);
        System.out.println(date+"/"+month+"/"+year);
    }
}
