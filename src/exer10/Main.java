package exer10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nota A: ");
		double a = sc.nextDouble();
		System.out.print("Nota B: ");
		double b = sc.nextDouble();
		System.out.print("Nota C: ");
		double c = sc.nextDouble();

		double total = a + b + c;
		double media = total / 3;

		System.out.printf("Media: %.2f", media);

		sc.close();
	}

}
