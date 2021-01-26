package Exercicios;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String args[]) {
		
		double A, B, C, D; 
		
	Scanner ler = new Scanner (System.in);
	
	System.out.println("Insira um valor inteiro");
	 A=ler.nextInt();
	 
	 System.out.println("Insira um valor inteiro");
	 B=ler.nextInt();
	 
	 System.out.println("Insira um valor inteiro");
	 C=ler.nextInt();
	 
	 D= Math.pow((A+B),2)+Math.pow((B+C),2)/2;
	 
	 System.out.printf("O valor de D é: "+ D);
	 
	 
	 
	 
		
	}

}
