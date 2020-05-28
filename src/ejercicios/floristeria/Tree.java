package ejercicios.floristeria;

public class Tree extends BaseFloristObject {
    private double height;

    public Tree (double price, double height) {
        super(price);

        this.height = height;
    }

    @Override
    public String toString () {
        return super.toString()+", heigth: "+height;
    }
}
