package exer03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite Valor de A: ");
		int a = sc.nextInt();
		System.out.print("Digite Valor de B: ");
		int b = sc.nextInt();

		int resultado;

		if (a == b) {
			resultado = a + b;
		} else {
			resultado = a * b;
		}

		int c = resultado;
		System.out.print("Valor de C = " + c);

		sc.close();
	}

}
