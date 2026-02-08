package exer11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double total = 0;

		for (int i = 1; i <= 4; i++) {
			System.out.print("Nota " + i + ": ");
			total += sc.nextDouble();
		}

		double media = total / 4;

		if (media >= 7) {
			System.out.printf("Media: %.2f APROVADO!", media);
		} else {
			System.out.printf("Media: %.2f REPROVADO!", media);
		}

		sc.close();

	}

}
