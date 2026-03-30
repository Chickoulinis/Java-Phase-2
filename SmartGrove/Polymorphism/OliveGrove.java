package Polymorphism;

public class OliveGrove {

    public static void main(String[] args) {

        System.out.println("===== OLIVE GROVE SYSTEM =====");

        OliveTree tree1 = new OliveTree(1, "Kalamata", 2010);
        OliveTree tree2 = new OliveTree(2, "Koroneiki", 2012);
        OliveTree tree3 = new OliveTree(3, "Sparti", 2008);

        printTree(tree1);
        printTree(tree2);
        printTree(tree3);
    }

    public static void printTree(OliveTree tree) {

        System.out.println("----------------------");
        System.out.println("Tree ID: " + tree.getId());
        System.out.println("Type: " + tree.getOliveType());
        System.out.println("Age: " + tree.getAge());

        double oil = tree.harvestFruit();
        System.out.println("Oil Produced: " + oil + " liters");
    }
}
