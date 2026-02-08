package exer07;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite Apenas: true ou false\n");

		System.out.print("Primeiro Valor: ");
		boolean a = sc.nextBoolean();
		System.out.print("Segundo Valor: ");
		boolean b = sc.nextBoolean();

		if (a && b) {
			System.out.println("Ambos VERDADEIROS");
		} else if (!a && !b) {
			System.out.println("Ambos FALSOS");
		} else {
			System.out.println("Valores Diferentes");
		}

		sc.close();
	}

}
