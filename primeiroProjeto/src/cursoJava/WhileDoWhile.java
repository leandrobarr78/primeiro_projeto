package cursoJava;

public class WhileDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Estrutura de repetição while */

		int numero = 0;

		while (numero <= 60) { /* Primeiro verifica e depois executa */

			System.out.println("O número atual é: " + numero);
			numero++;
		}

		/*----------------------------------------------*/
		int numero2 = 0;
		do { /* Primeiro executa e depois verifica */

			System.out.println("O número atual é :" + numero2);
			numero2++;

		} while (numero2 <= 50);

	}
}
