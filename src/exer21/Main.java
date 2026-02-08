package exer21;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();

		int numeroAleatorio = random.nextInt(101);

		System.out.printf("Numero Aleatorio: %d", numeroAleatorio);

	}

}
