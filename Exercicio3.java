package Exercicios;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {

		int idade;

		Scanner ler = new Scanner(System.in);

		System.out.println("Qual � a sua idade?");
		idade = ler.nextInt();

		if (idade > 10 && idade <= 14) {
			System.out.println("Sua idade est� compreendida na faixa-et�ria infantil");
		} else if (idade >= 15 && idade <= 17) {
			System.out.println("Sua idade est� compreendida na faixa-et�ria juvenil");

		} else if (idade > 18 && idade <= 25) {
			System.out.println("Sua idade est� compreendida na faixa-et�ria adulto");
		} else {
			System.out.println("N�o compreende a nenhuma faixa-etparia adotada neste programa");
		}

	}

}
