package Atividade1;

import java.util.Random;

public class Matriz {

	public static void main(String[] args) {
		
		int[][] matriz = new int[3][4]; // inicializa a matriz com zeros
        Random randomico = new Random();
        for(int linhas=0;linhas<3;linhas++){
        	for(int cols=0;cols<4;cols++){
				matriz[linhas][cols]=randomico.nextInt(100);
        	}
        }
		int maior = 0;
		int menor = 101;
		for(int linhas=0;linhas<3;linhas++){
        	for(int cols=0;cols<4;cols++){
				if(matriz[linhas][cols] > maior) {
					maior = matriz[linhas][cols];
				}
				if(matriz[linhas][cols]<menor) {
					menor = matriz[linhas][cols];
				}
        	}
        }
		System.out.printf("Maior numero: %d\tMenor numero: %d\n\n", maior, menor);
		for(int linhas=0;linhas<3;linhas++){
			for(int cols=0;cols<4;cols++){			
				System.out.printf("%d\t",matriz[linhas][cols]);
			}
			System.out.println("");
		}  
	}
}
