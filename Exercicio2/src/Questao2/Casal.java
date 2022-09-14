package Questao2;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Casal {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		ListaLigada listaNoiva = new ListaLigada();
		ListaLigada listaNoivo = new ListaLigada();
		
		ListaLigada listaGeral = new ListaLigada();
		String nome;
		int tamanho;
		for(int i=0; i<6;i++) {
			System.out.println("Digite o convidado da Noiva");
			nome = ler.nextLine();
			listaNoiva.adicionar(nome);
		}
		for(int i=0;i<4;i++) {
			System.out.println("Digite o convidado do Noivo");
			nome = ler.nextLine();
			listaNoivo.adicionar(nome);
		}
		System.out.println("****Lista da Noiva****");
		for(int i=0; i<listaNoiva.getTamanho();i++) {
			System.out.println(listaNoiva.get(i).getValor());
		}
		System.out.println("****Lista do Noivo****");
		for(int i=0; i<listaNoivo.getTamanho();i++) {
			System.out.println(listaNoivo.get(i).getValor());
		}
		if(listaNoiva.getTamanho()>=listaNoivo.getTamanho()){
			tamanho = listaNoiva.getTamanho();
		}
		else 
			tamanho=listaNoiva.getTamanho();
		
		for(int i=0; i<tamanho;i++) {
			if(i<listaNoiva.getTamanho())
				listaGeral.adicionar(listaNoiva.get(i).getValor());
			if(i<listaNoivo.getTamanho())
				listaGeral.adicionar(listaNoivo.get(i).getValor());
			
		}
				
		
	}

}
