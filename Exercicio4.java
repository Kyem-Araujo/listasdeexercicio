package Exercicios;

import java.util.Scanner;

public class Exercicio4 {
	public static void main (String args[]) {
		double num,raiz, elevado;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.printf("Insira um n�mero inteiro qualquer");
		num=ler.nextDouble();
		
		if(num%2==0) {
			raiz=Math.sqrt(num);
			System.out.printf("O n�mero inserido � par e sua raiz quadrada �: %2.2f ",raiz);
			
		}
		else {
			elevado=Math.pow(num, 2);
			System.out.printf("O n�mero inserido � �mpar e quando elevado ao quadrado temos: %2.2f ", elevado);
		}
		
		
	}

}
