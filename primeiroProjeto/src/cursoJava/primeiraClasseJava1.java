package cursoJava;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursoJava.classes.Aluno;
import cursoJava.classes.Disciplina;

public class primeiraClasseJava1 {
	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		for (int qtd = 1; qtd <= 2; qtd++) {

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

			for (int pos = 1; pos <= 4; pos++) {
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

		for (Aluno aluno : alunos) {
			if (aluno.getNome().equalsIgnoreCase("Leandro")) {
				alunos.remove(aluno);
				break;
			} else {
				System.out.println(aluno);
				System.out.println("Média do aluno é: " + aluno.getMediaNota());
				System.out.println("O resultado: " + aluno.getAlunoAprovado2());
				System.out.println("-------------------------------------------");
			}
		}

	}
}
