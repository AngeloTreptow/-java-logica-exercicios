package exer20;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um Valor Inteiro: ");
		int i = sc.nextInt();

		System.out.print("\nTabuada do " + i);
		for (int j = 1; j <= 10; j++) {
			System.out.printf("\n%d x %d = %d", i, j, i * j);
		}

		sc.close();
	}

}
