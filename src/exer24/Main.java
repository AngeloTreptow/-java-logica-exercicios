package exer24;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o Tempo em Horas: ");
		double tempo = sc.nextDouble();
		System.out.print("Digite a Velocidade: ");
		double velocidade = sc.nextDouble();

		if (tempo > 0 && velocidade > 0) {
			double distancia = tempo * velocidade;
			double litrosUsados = distancia / 12;
			double velocidadeMedia = velocidade;

			System.out.printf(
					"\nTempo Gasto: %.2f\nVelocidade Média: %.2f\n"
							+ "Distância Percorrida: %.2f km\nLitros Utilizados: %.2f",
					tempo, velocidadeMedia, distancia, litrosUsados);
		} else {
			System.out.println("Erro, entrada Invalida!");
		}
		sc.close();
	}

}
