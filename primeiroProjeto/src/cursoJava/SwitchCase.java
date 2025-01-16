package cursoJava;

public class SwitchCase {

	/* Main é um método auto executável em Java */
	public static void main(String[] args) {

		int nota1 = 80;
		int nota2 = 60;
		int nota3 = 79;
		int nota4 = 80;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		/* SWITCH CASE: OPERAÇÕES EXATAS */
		int dia = 3;
		switch (dia) {
		case 1:
			System.out.println("domingo");
			break;
		case 2:
			System.out.println("segunda-feira");
			break;
		case 3:
			System.out.println("terça-feira");
			break;
		default:
			System.out.println("Outro dia qualquer");
			break;
		}
	}
}
