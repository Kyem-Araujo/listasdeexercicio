package Exercicios;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String args []) {
		int meses, dias, anos, dias1; 
	
		Scanner ler = new Scanner (System.in);
		
		System.out.println(" Quantos dias você já viveu?");
		dias = ler.nextInt();
		
		anos = (dias/365);
		meses=(anos%365)/30;
		dias1=(dias%365%30)/1;
		
		System.out.println("Você tem: "+ anos + "ano(s)"  + meses + "mes(es) e"  + dias1 +"dia(s)" );
		
				
	}

}
