package ejercicios.floristeria;

import java.util.ArrayList;

public class Florist {
    private ArrayList<Tree> trees = new ArrayList<>();
    private ArrayList<Flower> flowers = new ArrayList<>();
    private ArrayList<Decoration> decorations = new ArrayList<>();


    public void addTree (Tree tree) {
        trees.add(tree);
    }

    public void addFlower (Flower flower) {
        flowers.add(flower);
    }

    public void addDecoration (Decoration decoration) {
        decorations.add(decoration);
    }

    public void printStock () {
        System.out.println("Trees "+trees.size()+": ");
        for (Tree tree : trees) System.out.println(tree.toString());

        System.out.println("Flowers "+flowers.size()+": ");
        for (Flower flower : flowers) System.out.println(flower.toString());

        System.out.println("Decorations "+decorations.size()+": ");
        for (Decoration decoration : decorations) System.out.println(decoration.toString());
    }
}
