package av2_questao2;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        AVLTree.Node root = null;

        int[] vetor = new int[]{50,13, 5, 17 , 9, 8, 10, 12, 55, 70};
        int menu;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Menu:");

            System.out.println("1- Inserir \n 2- Excluir \n 3- In-Ordem \n 4- Sair");

            menu = scan.nextInt();

            switch (menu) {
                case 1 -> {
                    for (int j : vetor) {
                        root = tree.insert(root, j);
                    }
                }
                case 2 -> {
                    System.out.println("Excluir valor");
                    int value = scan.nextInt();
                    tree.deleteNode(root, value);
                }
                case 3 -> {
                    System.out.println("Pré-Ordem");
                    tree.preOrder(root);
                }
                case 4 -> {
                    tree.print(root);
                }
                case 5 -> {
                    System.out.println("Fim");
                }
            }
        } while (menu != 5);
        scan.close();
    }
}

