package ejercicios.floristeria;

public class MainClass {
    public static void main (String[] args) {

        Florist florist1 = new Florist();

        Tree tree1 = new Tree(25.23, 2.5);
        florist1.addTree(tree1);

        Flower flower1 = new Flower(3, Color.RED);
        florist1.addFlower(flower1);

        florist1.printStock();
    }
}
