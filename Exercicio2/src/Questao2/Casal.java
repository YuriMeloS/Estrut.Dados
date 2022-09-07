package Questao2;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Casal {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		List<Integer> lista1 = new ArrayList<Integer>();
		for(int i=0; i<=10; i++) {
        	lista1.add(i);
        }
        
        List<Integer> list2 = new ArrayList<Integer>();
        for(int i=0; i<=10; i++) {
        	list2.add(i);
        }
        
        List<Integer> concatenated_list = new ArrayList<Integer>();
        concatenated_list.addAll(lista1);
        concatenated_list.addAll(list2);
        
        System.out.println("list1: " + lista1);
        System.out.println("list2: " + list2);
        System.out.println("Concatenated list: " + concatenated_list);
				
		
	}

}
