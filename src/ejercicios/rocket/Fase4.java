package ejercicios.rocket;

import java.util.List;
import java.util.Scanner;

public class Fase4 {
    public static void main(String[] args){
        Rocket rocket1 = new Rocket("32WESSDS",3);
        rocket1.addThruster(3);
        rocket1.addThruster(10);
        rocket1.addThruster(5);

        //Set the initial speed and target speed
        Scanner in = new Scanner(System.in);
        System.out.println("Please set the initial speed: ");
        double v0 = in.nextInt();

        System.out.println("Please set the target speed: ");
        double v = in.nextInt();

        int sumMaxPower = 0;
        List<Integer> thrustersMaxPower = rocket1.getThrustersMaxPower();

        //Caculate the total power required,distributed among the rockets
        for(int i = 0; i < thrustersMaxPower.size(); i++){
            sumMaxPower += thrustersMaxPower.get(i);
        }
        if (v<=v0+100*Math.sqrt(sumMaxPower)) {
            int neededPower = (int)(Math.ceil(Math.pow((v-v0)/100.0, 2)));
            System.out.println("needPower: "+neededPower);

            int restPower = neededPower;
            List<Integer> thrustersLeftPower = rocket1.getThrustersMaxPower();
            while (restPower>0) {
                for(int i = 0; i < thrustersLeftPower.size() && restPower>0; i++) {
                    int leftPower = thrustersLeftPower.get(i);
                    if (leftPower>0){
                        restPower--;
                        thrustersLeftPower.set(i, leftPower-1);
                    }
                }
            }

            for (int i=0; i<thrustersMaxPower.size(); i++) {
                int maxPower = thrustersMaxPower.get(i);
                int leftPower = thrustersLeftPower.get(i);
                System.out.println("Thruster "+i+" uses "+(maxPower-leftPower)+" power");
            }
        }

        //If lack of power to reach the target power, display it
        else {
            System.out.print("The rocket does not have enough power to reach the target speed");
        }
    }

}
