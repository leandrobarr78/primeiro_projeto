package cursoJava;

public class IfElse {

	/* Main é um método auto executável em Java */
	public static void main(String[] args) {

		int nota1 = 90;
		int nota2 = 90;
		int nota3 = 99;
		int nota4 = 89;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		/* Condições logica com IF e ELSE */

		if (media >= 70) {
			System.out.println("Aluno aprovado " + media);
		} else if (media >= 40 && media <= 69) {
			System.out.println("Aluno em recuperação " + media);
		} else {
			System.out.println("Aluno reprovado " + media);
		}

	}
}
