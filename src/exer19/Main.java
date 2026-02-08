package exer19;

public class Main {

	public static void main(String[] args) {

		int l = 10;

		for (int i = 1; i <= l; i++) {
			System.out.printf("\nTabuada do %d", i);

			for (int j = 1; j <= l; j++) {
				System.out.printf("\n%d x %d = %d", i, j, i * j);
			}
			System.out.println();
		}

	}

}
