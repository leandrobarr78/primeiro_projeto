package cursoJava;

public class ForComBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Estrutura de repetição FOR com Break */

		for (int numero = 0; numero <= 100; numero++) {
			if (numero == 27) {
				System.out.println("Obaaa, encontrei o número 27");
				System.out.println("estou parando de executar...");
				break;
			}
		}

	}
}