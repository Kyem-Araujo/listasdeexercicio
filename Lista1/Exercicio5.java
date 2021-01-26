package Exercicios;

import java.util.Scanner;

public class Exercicio5 {
	public static void main (String args[]) {
		
		float nota1, nota2, nota3, media, peso1, peso2, peso3;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println(" insira a primeira nota ");
		nota1=ler.nextFloat();
		
		System.out.println(" insira a segunda nota ");
		nota2=ler.nextFloat();
		
		System.out.println(" insira a terceira nota ");
		nota3=ler.nextFloat();
		
		System.out.println(" insira o peso 1 ");
		peso1=ler.nextFloat();
		
		System.out.println(" insira o peso 2 ");
		peso2=ler.nextFloat();
		
		System.out.println(" insira o peso 3 ");
		peso3=ler.nextFloat();
		
		media=(nota1+nota2+nota3/peso1+peso2+peso3);
		
		System.out.println(" A média do aluno é: " + media);
		
		
		
		
		
	}

}
