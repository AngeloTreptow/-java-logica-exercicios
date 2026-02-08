package exer16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite Valor A: ");
		int a = sc.nextInt();
		System.out.print("Digite Valor B: ");
		int b = sc.nextInt();
		System.out.print("Digite Valor C: ");
		int c = sc.nextInt();

		String resultado = null;

		if (a + b > c && a + c > b && b + c > a) {
			if (a == b && b == c) {
				resultado = "Equilátero";
			} else if (a == b || a == c || b == c) {
				resultado = "Isósceles";
			} else if (a != b && a != c && b != c) {
				resultado = "Escaleno";
			}
		} else {
			resultado = "Invalido!";
		}

		System.out.println("O Triangulo é " + resultado);

		sc.close();
	}

}
