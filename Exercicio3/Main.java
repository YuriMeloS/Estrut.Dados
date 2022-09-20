import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class Main {

  public static void main(String[] args) throws FileNotFoundException {
        Stack<String> texto = new Stack<>();
        Queue<String> top10Texto = new LinkedList<>();
        Scanner scanner;

        scanner = new Scanner(new File("./texto.txt"));
        while (scanner.hasNextLine())
            texto.add(scanner.nextLine());

        if (!frases.isEmpty()) {
            while (top10Frases.size() < 10)
                top10Frases.add(frases.pop());

            System.out.println("Frases depois da decima:");
            while (!frases.empty())
                System.out.println(frases.pop());

            System.out.println("-----------------------------------");
            System.out.println("Top 10 frases:");
            top10Frases.forEach(System.out::println);
        } else
            System.out.println("Não existem frases buscadas.");
    }
  
}