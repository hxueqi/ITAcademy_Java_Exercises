package ejercicios.vehicles;


import java.util.List;

public class Bike extends Vehicle {

    public Bike(String plate, String brand, String color) {
        super(plate, brand, color);
    }

    @Override
    protected void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
        addOneWheel(frontWheels);
        addOneWheel(backWheels);
    }

    private void addOneWheel(List<Wheel> wheels) throws Exception {
        if (wheels.size() != 1)
            throw new Exception();

        this.wheels.add(wheels.get(0));
    }
}


