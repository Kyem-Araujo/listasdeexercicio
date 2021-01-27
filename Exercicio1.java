package Exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		int num1, num2, num3;

		Scanner ler = new Scanner(System.in);

		System.out.println(" Insira um número inteiro");
		num1 = ler.nextInt();

		System.out.println(" Insira um número inteiro");
		num2 = ler.nextInt();

		System.out.println(" Insira um número inteiro");
		num3 = ler.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.println("O maior valor é: " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("O maior valor é: " + num2);
		} else {
			System.out.println("O maior valor é: " + num3);
		}

	}

}
