package cursoJava;

public class OperadorTernario {

	/* Main é um método auto executável em Java */
	public static void main(String[] args) {

		int nota1 = 90;
		int nota2 = 90;
		int nota3 = 99;
		int nota4 = 89;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		/* operadores ternários são para micro validações */

		String saidaResultado;

		saidaResultado = media >= 70 ? "Aluno Aprovado"
				: (media >= 40 && media <= 69) ? "Aluno em recuperação" : "Reprovado";

		System.out.println(saidaResultado);

	}
}
