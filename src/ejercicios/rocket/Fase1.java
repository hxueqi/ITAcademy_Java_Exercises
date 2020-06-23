package ejercicios.rocket;

public class Fase1 {
    public static void main(String[] args){
        //Create two rockets with the codes “x”(has 3 thrusters) and “LDSFJA32”(has 6 thrusters).
        Rocket rocket1 = new Rocket("XXXXXXXX",3);
        Rocket rocket2 = new Rocket("LDSFJA32",6);

        //Display the rocket code and the number of thrusters
        System.out.println("The roket code: " + rocket1.getCode());
        System.out.println("The amount of thrusters: " + rocket1.getNumThrusters());
        System.out.println("--------");

        System.out.println("The roket code: " + rocket2.getCode());
        System.out.println("The amount of thrusters: " + rocket2.getNumThrusters());
        System.out.println("--------");
    }
}
