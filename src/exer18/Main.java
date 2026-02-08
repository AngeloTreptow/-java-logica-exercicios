package exer18;

public class Main {

	public static void main(String[] args) {

		// Alturas Inicials em Cm
		int altuFran = 150;
		int altuSara = 110;

		int anos = 0;

		while (altuFran >= altuSara) {
			altuSara += 3;
			altuFran += 2;
			anos++;
		}

		System.out.printf("Sara ultrapassará a altura de Francisco em %d anos.\n", anos);
	}

}
