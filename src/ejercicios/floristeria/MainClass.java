package ejercicios.floristeria;

public class MainClass {
    public static void main (String[] args) {
        //Create the floristeria
        Florist florist1 = new Florist();

        //Create the tree with price and height
        Tree tree1 = new Tree(25.23, 2.5);
        florist1.addTree(tree1);

        //Create the tree with price and color
        Flower flower1 = new Flower(3, Color.RED);
        florist1.addFlower(flower1);

        florist1.printStock();
    }
}
