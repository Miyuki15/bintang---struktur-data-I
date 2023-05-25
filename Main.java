package modul5lat;

public class Main {
    public static void main(String[] args) {
        BinaryTree pohon = new BinaryTree();

        pohon.NewNode(28);
        pohon.NewNode(2);
        pohon.NewNode(25);
        pohon.NewNode(37);
        pohon.NewNode(16);

        System.out.println("\n preOrder :");
        pohon.preOrder(pohon.root);
        System.out.println("\n nin Order :");
        pohon.inOrder(pohon.root);
        System.out.println("\n post order:");
        pohon.inOrder(pohon.root);
    }

}
