package Exercicios;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main (String args[]) {
		
	int horas, minutos, segundos, duracao;
	
	Scanner ler = new Scanner (System.in);
	
	System.out.println("Informe a dura��o do evento em segundos");
	duracao=ler.nextInt();
			
			horas=(duracao/3600);
			minutos=(duracao%3600)/60;
			segundos=((duracao%3600)%60);
		
	System.out.println(" A dura��o do evento � de: " + horas+ " horas " +minutos+ " minutos " +segundos+ " segundos ");
			
	
	
	
	}

}
