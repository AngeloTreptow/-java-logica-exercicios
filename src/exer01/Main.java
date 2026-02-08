package exer01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite Valor de A: ");
		int a = sc.nextInt();
		System.out.print("Digite Valor de B: ");
		int b = sc.nextInt();
		System.out.print("Digite Valor de C: ");
		int c = sc.nextInt();

		int soma = a + b;
		System.out.println("Soma de A + B: " + soma);

		if (soma < c) {
			System.out.print("Soma é MENOR que C");
		} else {
			System.out.print("Soma NÃO é Menor que C");
		}

		sc.close();
	}

}
