package ejercicios.rocket;

public class Fase1 {
    public static void main(String[] args){
        Rocket rocket1 = new Rocket("XXXXXXXX",3);
        Rocket rocket2 = new Rocket("LDSFJA32",6);

        System.out.println("The roket code: " + rocket1.getCode());
        System.out.println("The amount of thrusters: " + rocket1.getNumThrusters());
        System.out.println("--------");

        System.out.println("The roket code: " + rocket2.getCode());
        System.out.println("The amount of thrusters: " + rocket2.getNumThrusters());
        System.out.println("--------");
    }
}
