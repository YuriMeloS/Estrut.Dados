package av2_questao1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;


public class Questao1 {

    public static void main(String[] args) throws FileNotFoundException, FullStackException {

        ArrayStack<String> pilha1 = new ArrayStack<>();

        LinkedList<String> lista1 = new LinkedList<>();

        Scanner scan;

        scan = new Scanner(new File("C:/Users/12111548/Downloads/nomes.txt"));

        while (scan.hasNextLine()) {
            pilha1.push(scan.nextLine());
        }

        while (!pilha1.isEmpty()) {
            var name = pilha1.pop();
            lista1.push(name);
        }

        System.out.println("Lista de Nomes: ");
        lista1.forEach(System.out::println);
    }
}
