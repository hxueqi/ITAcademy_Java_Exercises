package ejercicios.rocket;

public class Thruster {
    private String name;
    private int maxPower;
    private int currentPower;
    private int targetPower;

    public Thruster(String name, int maxPower){
        this.name = name;
        this.maxPower = maxPower;
        this.currentPower = 0;
    }

    public void setTargetPower (int targetPower) {
        if (targetPower>=0 && targetPower<=maxPower) {
            if (currentPower<targetPower) accelerate(targetPower);
            else if (currentPower>targetPower) decelerate(targetPower);
        }
        else {
            System.out.println("The target power for this thruster has to be between 0 and "+maxPower);
        }
    }

    private void accelerate(int targetPower){
        Thread thread = new Thread(()->{
            while (currentPower<targetPower) {
                currentPower++;
                System.out.println(name+" accelerating. Current power: "+currentPower);
            }
        });
        thread.start();
    }

    private void decelerate(int targetPower){
        Thread thread = new Thread(){
            public void run(){
                while (currentPower>targetPower) {
                    currentPower--;
                    System.out.println(name+" decelerating. Current power: "+currentPower);
                }
            }
        };
        thread.start();
    }

    public int getMaxPower () {
        return this.maxPower;
    }
    public int getCurrentPower(){
        return this.currentPower;
    }
    public int getTargetPower(){
        return this.targetPower;
    }
}
