package ejercicios.vehicles;

import java.util.Scanner;

public class Wheel {
    private String brand;
    private double diameter;

    public Wheel(String brand, double diameter) {
        this.brand = brand;
        this.diameter = diameter;
    }

        /*public boolean equals (Wheel w) {
            return this.brand.equals(w.brand) && this.diameter==w.diameter;
        }*/

    @Override
    public boolean equals (Object o) {
        Wheel w = (Wheel)o;
        return this.brand.equals(w.brand) && this.diameter==w.diameter;
    }
}