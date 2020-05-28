package ejercicios.floristeria;

public class Decoration extends BaseFloristObject {
    private Material material;

    public Decoration (double price, Material material) {
        super(price);

        this.material = material;
    }

    @Override
    public String toString () {
        return super.toString()+", material: "+material;
    }
}
