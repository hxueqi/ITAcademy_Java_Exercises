package ejercicios.rocket;

import java.util.ArrayList;
import java.util.List;


public class Rocket {
    private String code;
    private int numThrusters;
    private List<Thruster> thrusters;

    public Rocket(String code, int numThrusters){
        this.code = code;
        this.numThrusters = numThrusters;
        this.thrusters = new ArrayList<>();
    }

    public void addThruster(int maxPower){
        Thruster thruster = new Thruster(code+"_thruster_"+this.thrusters.size(), maxPower);
        this.thrusters.add(thruster);
    }

    public String getCode () {
        return this.code;
    }

    public int getNumThrusters () {
        return this.numThrusters;
    }

    public List<Integer> getThrustersMaxPower () {
        List<Integer> result = new ArrayList<>();
        for (Thruster t : this.thrusters) {
            result.add(t.getMaxPower());
        }
        return result;
    }

    public void setTargetPower (int thrusterIndex, int targetPower) {
        Thruster t = this.thrusters.get(thrusterIndex);
        t.setTargetPower(targetPower);
    }

    /*public void printEveryThrusterCurrentPower () {
        for (int i=0; i<this.thrusters.size(); i++) {
            Thruster t = this.thrusters.get(i);
            System.out.println(i+": "+t.getCurrentPower());
        }
    }*/
}

