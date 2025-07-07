package cursoJava;

import javax.swing.JOptionPane;

import cursoJava.classes.Aluno;

public class primeiraClasseJava1 {
	public static void main(String[] args) {

		/* New Aluno() é uma instância (criação de objeto) */
		/* aluno1 é uma referência para o objeto aluno */

		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("idade do aluno?");
		String dataNascimento = JOptionPane.showInputDialog("Data de nascimento");
		String registroGeral = JOptionPane.showInputDialog("Nº RG");
		String numeroCpf = JOptionPane.showInputDialog("Nº CPF");
		String nomeMae = JOptionPane.showInputDialog("Nome da Mãe");
		String nomePai = JOptionPane.showInputDialog("Nome do Pai");
		String dataMatricula = JOptionPane.showInputDialog("data da matricula");
		String nomeEscola = JOptionPane.showInputDialog("Nome da escola");
		String serieMatriculado = JOptionPane.showInputDialog("Série da matrícula");
		String nota1 = JOptionPane.showInputDialog("Primeira nota");
		String nota2 = JOptionPane.showInputDialog("Segunda nota");
		String nota3 = JOptionPane.showInputDialog("Terceira nota");
		String nota4 = JOptionPane.showInputDialog("Quarta nota");

		Aluno aluno1 = new Aluno();

		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(registroGeral);
		aluno1.setNumeroCpf(numeroCpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setNomeEscola(nomeEscola);
		aluno1.setSerieMatriculado(serieMatriculado);
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));

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
		System.out.println("Resultado é: " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));

		/*
		 * =============================================================================
		 * =
		 */

		Aluno aluno2 = new Aluno();/* Aqui será o Pedro */

		Aluno aluno3 = new Aluno();/* Aqui será o Leandro */

		Aluno aluno4 = new Aluno();

		Aluno aluno5 = new Aluno();

	}

}
