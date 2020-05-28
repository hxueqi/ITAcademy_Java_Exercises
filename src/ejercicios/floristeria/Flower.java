package ejercicios.floristeria;

public class Flower extends BaseFloristObject {
    private Color color;

    public Flower (double price, Color color) {
        super(price);

        this.color = color;
    }

    @Override
    public String toString () {
        return super.toString()+", color: "+color;
    }
}
