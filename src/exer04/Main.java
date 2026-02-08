package exer04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um Numero Inteiro: ");
		int n = sc.nextInt();

		System.out.println("Antecessor: " + (n - 1));
		System.out.println("Sucessor: " + (n + 1));

		sc.close();
	}

}
