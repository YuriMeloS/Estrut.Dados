import java.util.Random;
import java.util.Scanner;

class Main {
  private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        System.out.println("Arvore Binaria de Pesquisa");
        Arvore tree = escolherParametros();

        do {
            System.out.println("Escolha um numero:");
            System.out.println("1 - Menor elemento");
            System.out.println("2 - Maior elemento");
            System.out.println("3 - Altura");
            System.out.println("4 - Arvore balanceada?");
            System.out.println("5 - Sair");
            System.out.print("-> ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Menor elemento: " + tree.min());
                    break;
                case 2:
                    System.out.println("Maior elemento: " + tree.max());
                    break;
                case 3:
                    System.out.println("Altura: " + tree.height());
                    break;
                case 4:
                    System.out.println("Balanceada: " + tree.isBalanced());
                    break;
                case 5:
                    System.out.println("Fim!");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 5);

        sc.close();
    }

    private static Tree escolherParametros() {
        int valorMaximoPermitido, quantidade;
        Tree binaryTree = new Tree();

        System.out.print("Quantos elementos deseja inserir na árvore: ");
        quantidade = sc.nextInt();
        System.out.print("Valor máximo permitido [INTEGER]: ");
        valorMaximoPermitido = sc.nextInt();
        preencherArvore(binaryTree,quantidade,valorMaximoPermitido);

        return binaryTree;
    }

    private static void preencherArvore(Tree binaryTree, int quantidade, int valorMaximoPermitido) {
        Random random = new Random();
        int num;
        System.out.println();
        while (quantidade > 0) {
            num = random.nextInt(valorMaximoPermitido);
            binaryTree.insert(num);
            System.out.println("Valor inserido: " + num);
            quantidade--;
        }
        System.out.println();
    }
  }
}