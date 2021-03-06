package ejercicios.rocket;

public class Fase3 {
    public static void main(String[] args){
        Rocket rocket1 = new Rocket("32WESSDS",3);
        rocket1.addThruster(10);
        rocket1.addThruster(30);
        rocket1.addThruster(80);

        Rocket rocket2 = new Rocket("XXXXXXXX",6);
        rocket2.addThruster(30);
        rocket2.addThruster(40);
        rocket2.addThruster(50);
        rocket2.addThruster(50);
        rocket2.addThruster(30);
        rocket2.addThruster(10);

        System.out.println("The roket code: " + rocket1.getCode() + " : " + rocket1.getThrustersMaxPower());
        System.out.println("The amount of thrusters: " + rocket1.getNumThrusters());
        System.out.println("--------");

        System.out.println("The roket code: " + rocket2.getCode() + " : " + rocket2.getThrustersMaxPower());
        System.out.println("The amount of thrusters: " + rocket2.getNumThrusters());
        System.out.println("--------");

        //Set the target power
        rocket1.setTargetPower(0, 8);
        rocket1.setTargetPower(1, 24);
        rocket1.setTargetPower(2, 12);
    }
}
