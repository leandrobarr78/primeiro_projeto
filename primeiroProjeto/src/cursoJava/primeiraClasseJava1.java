package cursoJava;

import cursoJava.classes.Aluno;

public class primeiraClasseJava1 {
	public static void main(String[] args) {

		/* New Aluno() é uma instância (criação de objeto) */
		Aluno aluno1 = new Aluno();/* Aqui será o João */

		/* aluno1 é uma referência para o objeto aluno */
		aluno1.setNome("João Miranda");
		aluno1.setIdade(47);
		aluno1.setDataNascimento("10/05/1978");
		aluno1.setRegistroGeral("10843995-1");
		aluno1.setNumeroCpf("067.345.687-72");
		aluno1.setNomeMae("Rosa Miranda");
		aluno1.setNomePai("Valdo Miranda");
		aluno1.setDataMatricula("15/01/2024");
		aluno1.setNomeEscola("JDEV treinamento");
		aluno1.setSerieMatriculado("5º período");
		aluno1.setNota1(90);
		aluno1.setNota2(65);
		aluno1.setNota3(58);
		aluno1.setNota4(92);

		System.out.println("O nome é " + aluno1.getNome());
		System.out.println("A idade é " + aluno1.getIdade());
		System.out.println("A data de nascimento é " + aluno1.getDataNascimento());
		System.out.println("O registro geral é " + aluno1.getRegistroGeral());
		System.out.println("O numero do cpf é " + aluno1.getNumeroCpf());
		System.out.println("O nome da mãe é " + aluno1.getNomeMae());
		System.out.println("O nome do pai é " + aluno1.getNomePai());
		System.out.println("A data de matrícula é " + aluno1.getDataMatricula());
		System.out.println("O nome da escola é " + aluno1.getNomeEscola());
		System.out.println("A série do matriculado é o " + aluno1.getSerieMatriculado());
		System.out.println("A média do aluno é " + aluno1.getMediaNota());

		/*
		 * =============================================================================
		 * =
		 */

		Aluno aluno2 = new Aluno();/* Aqui será o Pedro */

		Aluno aluno3 = new Aluno();/* Aqui será o Leandro */

		Aluno aluno4 = new Aluno("Maria");

		Aluno aluno5 = new Aluno("José", 21);

	}

}
