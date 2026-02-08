package exer08;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite Valores apenas Inteiros\n");
		System.out.print("Valor A: ");
		int a = sc.nextInt();
		System.out.print("Valor B: ");
		int b = sc.nextInt();
		System.out.print("Valor C: ");
		int c = sc.nextInt();

		if (a > b && a > c) {
			if (b > c) {
				System.out.printf("%d, %d, %d", a, b, c);
			} else {
				System.out.printf("%d, %d, %d", a, c, b);
			}
		} else if (b > a && b > c) {
			if (a > c) {
				System.out.printf("%d, %d, %d", b, a, c);
			} else {
				System.out.printf("%d, %d, %d", b, c, a);
			}
		} else {
			if (b > a) {
				System.out.printf("%d, %d, %d", c, b, a);
			} else {
				System.out.printf("%d, %d, %d", c, a, b);
			}
		}

		sc.close();
	}

}
