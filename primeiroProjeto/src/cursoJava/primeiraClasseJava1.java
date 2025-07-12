package cursoJava;

import javax.swing.JOptionPane;

import cursoJava.classes.Aluno;
import cursoJava.classes.Disciplina;

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

		Disciplina disciplina11 = new Disciplina();
		disciplina11.setDisciplina("Banco de dados");
		disciplina11.setNota(90);

		aluno1.getDisciplinas().add(disciplina11);

		Disciplina disciplina22 = new Disciplina();
		disciplina22.setDisciplina("Matemática");
		disciplina22.setNota(80);

		aluno1.getDisciplinas().add(disciplina22);

		Disciplina disciplina33 = new Disciplina();
		disciplina33.setDisciplina("Geografia");
		disciplina33.setNota(97);

		aluno1.getDisciplinas().add(disciplina33);

		Disciplina disciplina44 = new Disciplina();
		disciplina44.setDisciplina("Java Web");
		disciplina44.setNota(90);

		aluno1.getDisciplinas().add(disciplina44);

		System.out.println(aluno1.toString());
		System.out.println("Média do aluno é: " + aluno1.getMediaNota());
		System.out.println("O resultado: " + aluno1.getAlunoAprovado2());

		/* Equals e Hashcode(Diferenciar e comparar Objetos) */

		/*
		 * Aluno Aluno1 = new Aluno(); Aluno1.setNome("Leandro");
		 * 
		 * Aluno Aluno2 = new Aluno(); Aluno2.setNome("Leandro");
		 * 
		 * if (Aluno1.equals(Aluno2)) { System.out.println("Alunos são iguais");
		 * 
		 * } else { System.out.println("Alunos não são iguais"); }
		 */

	}

}
