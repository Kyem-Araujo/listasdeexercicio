package Exercicios;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {

		int idade;

		Scanner ler = new Scanner(System.in);

		System.out.println("Qual é a sua idade?");
		idade = ler.nextInt();

		if (idade > 10 && idade <= 14) {
			System.out.println("Sua idade está compreendida na faixa-etária infantil");
		} else if (idade >= 15 && idade <= 17) {
			System.out.println("Sua idade está compreendida na faixa-etária juvenil");

		} else if (idade > 18 && idade <= 25) {
			System.out.println("Sua idade está compreendida na faixa-etária adulto");
		} else {
			System.out.println("Não compreende a nenhuma faixa-etparia adotada neste programa");
		}

	}

}
