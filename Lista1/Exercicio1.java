package Exercicios;
	
	import java.util.Scanner;

public class Exercicio1 {
	public static void main (String[] args) {
		
		int idade, ano, dia, mes,  dias;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Qual o dia do seu nascimento?");
		dia = ler.nextInt();
		
		System.out.println("Qual mes do seu nascimento?");
		mes = ler.nextInt();
		
		System.out.println("Qual ano do seu nascimento?");
		ano = ler.nextInt();
		
		idade = (2021 - ano );
		
		dias = (idade*365);
		
		System.out.println(" Você já viveu :  " +dias);
				
		
		
	}

}
