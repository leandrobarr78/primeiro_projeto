package cursoJava.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

import cursoJava.constantes.StatusAluno;

public class primeiraClasseJava1 {
	public static void main(String[] args) {
		
		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe a senha");
		
		if(login.equalsIgnoreCase("admin") &&
				senha.equalsIgnoreCase("admin")) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		/*
		 * é uma lista que dentro dela temos uma chave que identifica uma sequencia de
		 * valores também
		 */
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

		/*
		 * List<Aluno> alunosAprovados = new ArrayList<Aluno>(); List<Aluno>
		 * alunosRecuperacao = new ArrayList<Aluno>(); List<Aluno> alunosReprovados =
		 * new ArrayList<Aluno>();
		 */

		for (int qtd = 1; qtd <= 5; qtd++) {

			/* New Aluno() é uma instância (criação de objeto) */
			/* aluno1 é uma referência para o objeto aluno */

			String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + "?");
			/*
			 * String idade = JOptionPane.showInputDialog("idade do aluno?"); String
			 * dataNascimento = JOptionPane.showInputDialog("Data de nascimento"); String
			 * registroGeral = JOptionPane.showInputDialog("Nº RG"); String numeroCpf =
			 * JOptionPane.showInputDialog("Nº CPF"); String nomeMae =
			 * JOptionPane.showInputDialog("Nome da Mãe"); String nomePai =
			 * JOptionPane.showInputDialog("Nome do Pai"); String dataMatricula =
			 * JOptionPane.showInputDialog("data da matricula"); String nomeEscola =
			 * JOptionPane.showInputDialog("Nome da escola"); String serieMatriculado =
			 * JOptionPane.showInputDialog("Série da matrícula");
			 */

			Aluno aluno1 = new Aluno();

			aluno1.setNome(nome);
			/*
			 * aluno1.setIdade(Integer.valueOf(idade));
			 * aluno1.setDataNascimento(dataNascimento);
			 * aluno1.setRegistroGeral(registroGeral); aluno1.setNumeroCpf(numeroCpf);
			 * aluno1.setNomeMae(nomeMae); aluno1.setNomePai(nomePai);
			 * aluno1.setDataMatricula(dataMatricula); aluno1.setNomeEscola(nomeEscola);
			 * aluno1.setSerieMatriculado(serieMatriculado);
			 */

			for (int pos = 1; pos <= 1; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + " ?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + " ?");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno1.getDisciplinas().add(disciplina);
			}

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina? ");

			if (escolha == 0) {

				int continuaRemover = 0;
				int posicao = 1;

				while (continuaRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou 4? ");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					continuaRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");

				}

			}
			alunos.add(aluno1);
		}

		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

		for (Aluno aluno : alunos) {

			if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
			} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				maps.get(StatusAluno.RECUPERACAO).add(aluno);
			} else {
				maps.get(StatusAluno.REPROVADO).add(aluno);
			}
		}
		System.out.println("----------------------Lista dos Aprovados------------------------");
		for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
			System.out.println("Aluno: " + aluno.getNome() + " Resultado final = " + aluno.getAlunoAprovado2()
					+ " com média de + " + aluno.getMediaNota());
		}

		System.out.println("----------------------Lista de Recuperação------------------------");
		for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println("Aluno: " + aluno.getNome() + " Resultado final = " + aluno.getAlunoAprovado2()
					+ " com média de + " + aluno.getMediaNota());
		}

		System.out.println("----------------------Lista dos Reprovados------------------------");
		for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
			System.out.println("Aluno: " + aluno.getNome() + " Resultado final = " + aluno.getAlunoAprovado2()
					+ " com média de + " + aluno.getMediaNota());
		}

	}
		
	}

}
