package exer14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite Valor A: ");
		int a = sc.nextInt();
		System.out.print("Digite Valor B: ");
		int b = sc.nextInt();

		int n = a;
		a = b;
		b = n;

		System.out.printf("\nValor de A: %d\nValor de B: %d",a,b);

		sc.close();
	}

}
