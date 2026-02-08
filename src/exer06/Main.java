package exer06;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um Valor: ");
		double valor = sc.nextDouble();

		double reajuste = valor * 1.05;
		System.out.printf("Valor reajustado: %.2f", reajuste);

		sc.close();
	}

}
