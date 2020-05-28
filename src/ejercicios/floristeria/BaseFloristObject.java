package ejercicios.floristeria;

public class BaseFloristObject {
    protected double price;

    protected BaseFloristObject (double price) {
        this.price = price;
    }

    @Override
    public String toString () {
        return "price: "+price;
    }
}

//ITAcademy_Java_Exercises
