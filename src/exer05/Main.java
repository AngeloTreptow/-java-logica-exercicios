package exer05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o Salario Minimo: ");
		double a = sc.nextDouble();

		System.out.print("Digite seu Salario: ");
		double b = sc.nextDouble();

		double valorGanho = b / a;

		System.out.println("Calculo de quantos salários mínimo ganhos: " + valorGanho);

		sc.close();
	}

}
