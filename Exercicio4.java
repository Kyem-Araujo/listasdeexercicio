package Exercicios;

import java.util.Scanner;

public class Exercicio4 {
	public static void main (String args[]) {
		double num,raiz, elevado;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.printf("Insira um número inteiro qualquer");
		num=ler.nextDouble();
		
		if(num%2==0) {
			raiz=Math.sqrt(num);
			System.out.printf("O número inserido é par e sua raiz quadrada é: %2.2f ",raiz);
			
		}
		else {
			elevado=Math.pow(num, 2);
			System.out.printf("O número inserido é ímpar e quando elevado ao quadrado temos: %2.2f ", elevado);
		}
		
		
	}

}
