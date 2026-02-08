package exer02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite Qualquer Numero Inteiro: ");
		int n = sc.nextInt();

		if (n % 2 == 0) {
			System.out.printf("%d é PAR e ", n);
		} else {
			System.out.printf("%d é IMPAR e ", n);
		}

		if (n > 0) {
			System.out.print("POSITIVO");
		} else if (n < 0) {
			System.out.print("NEGATIVO");
		} else {
			System.out.print("ZERO");
		}

		sc.close();
	}

}
