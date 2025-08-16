package cursoJava;

import javax.swing.JOptionPane;
import cursoJava.classes.Aluno;
import cursoJava.classes.Disciplina;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CadastroAluno {
	private static final int NUM_DISCIPLINAS = 4;
	private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");

	static {
		DATE_FORMAT.setLenient(false); // Não aceita datas inválidas como 31/02/2023
	}

	public static void main(String[] args) {
		try {
			// Coleta de dados do aluno com validação
			String nome = solicitarDadoObrigatorio("Qual o nome do aluno?");
			int idade = solicitarIdadeValida();
			String dataNascimento = solicitarDataValida("Data de nascimento (DD/MM/AAAA)");
			String registroGeral = solicitarDadoObrigatorio("Nº RG");
			String numeroCpf = solicitarCpfValido();
			String nomeMae = solicitarDadoObrigatorio("Nome da Mãe");
			String nomePai = JOptionPane.showInputDialog("Nome do Pai (opcional)");
			String dataMatricula = solicitarDataValida("Data da matrícula (DD/MM/AAAA)");
			String nomeEscola = solicitarDadoObrigatorio("Nome da escola");
			String serieMatriculado = solicitarDadoObrigatorio("Série da matrícula");

			// Criação e configuração do aluno
			Aluno aluno1 = new Aluno();
			aluno1.setNome(nome);
			aluno1.setIdade(idade);
			aluno1.setDataNascimento(dataNascimento);
			aluno1.setRegistroGeral(registroGeral);
			aluno1.setNumeroCpf(numeroCpf);
			aluno1.setNomeMae(nomeMae);
			aluno1.setNomePai(nomePai);
			aluno1.setDataMatricula(dataMatricula);
			aluno1.setNomeEscola(nomeEscola);
			aluno1.setSerieMatriculado(serieMatriculado);

			// Coleta de disciplinas e notas
			for (int pos = 1; pos <= NUM_DISCIPLINAS; pos++) {
				String nomeDisciplina = solicitarDadoObrigatorio("Nome da disciplina " + pos + "?");
				double nota = solicitarNotaValida(nomeDisciplina);

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(nota);
				aluno1.getDisciplinas().add(disciplina);
			}

			// Exibição dos resultados
			exibirDadosAluno(aluno1);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado: " + e.getMessage());
		}
	}

	private static String solicitarDadoObrigatorio(String mensagem) {
		String dado;
		do {
			dado = JOptionPane.showInputDialog(mensagem);
			if (dado == null) {
				System.exit(0); // Usuário cancelou
			}
			if (dado.trim().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Este campo é obrigatório!");
			}
		} while (dado.trim().isEmpty());
		return dado;
	}

	private static int solicitarIdadeValida() {
		int idade = 0;
		boolean valido;
		do {
			valido = true;
			try {
				String idadeStr = JOptionPane.showInputDialog("Idade do aluno?");
				if (idadeStr == null)
					System.exit(0);

				idade = Integer.parseInt(idadeStr);
				if (idade <= 0 || idade > 120) {
					JOptionPane.showMessageDialog(null, "Idade deve estar entre 1 e 120 anos!");
					valido = false;
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite uma idade válida (número inteiro)!");
				valido = false;
			}
		} while (!valido);
		return idade;
	}

	private static String solicitarDataValida(String mensagem) {
		String data;
		boolean valido;
		do {
			valido = true;
			data = JOptionPane.showInputDialog(mensagem);
			if (data == null)
				System.exit(0);

			// Verifica formato DD/MM/AAAA
			if (!data.matches("^\\d{2}/\\d{2}/\\d{4}$")) {
				JOptionPane.showMessageDialog(null, "Formato inválido! Use DD/MM/AAAA");
				valido = false;
				continue;
			}

			// Verifica se a data é válida
			try {
				DATE_FORMAT.parse(data);
			} catch (ParseException e) {
				JOptionPane.showMessageDialog(null, "Data inválida! Verifique o dia/mês/ano.");
				valido = false;
			}
		} while (!valido);
		return data;
	}

	private static String solicitarCpfValido() {
		String cpf;
		boolean valido;
		do {
			valido = true;
			cpf = JOptionPane.showInputDialog("Nº CPF (11 dígitos, somente números)");
			if (cpf == null)
				System.exit(0);

			// Remove caracteres não numéricos
			cpf = cpf.replaceAll("[^0-9]", "");

			if (cpf.length() != 11) {
				JOptionPane.showMessageDialog(null, "CPF deve ter exatamente 11 dígitos!");
				valido = false;
			} else if (!validarCPF(cpf)) {
				JOptionPane.showMessageDialog(null, "CPF inválido! Digite um CPF válido.");
				valido = false;
			}
		} while (!valido);

		// Formata o CPF (XXX.XXX.XXX-XX)
		return cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9);
	}

	private static double solicitarNotaValida(String disciplina) {
		double nota = 0;
		boolean valido;
		do {
			valido = true;
			try {
				String notaStr = JOptionPane.showInputDialog("Nota da disciplina " + disciplina + " (0-10)");
				if (notaStr == null)
					System.exit(0);

				nota = Double.parseDouble(notaStr);
				if (nota < 0 || nota > 10) {
					JOptionPane.showMessageDialog(null, "Nota deve estar entre 0 e 10!");
					valido = false;
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite uma nota válida (número)!");
				valido = false;
			}
		} while (!valido);
		return nota;
	}

	private static boolean validarCPF(String cpf) {
		// Verifica se todos os dígitos são iguais
		if (cpf.matches("(\\d)\\1{10}"))
			return false;

		try {
			int[] numeros = new int[11];
			for (int i = 0; i < 11; i++) {
				numeros[i] = Character.getNumericValue(cpf.charAt(i));
			}

			// Cálculo do primeiro dígito verificador
			int soma = 0;
			for (int i = 0; i < 9; i++) {
				soma += numeros[i] * (10 - i);
			}
			int resto = soma % 11;
			int digito1 = resto < 2 ? 0 : 11 - resto;

			// Cálculo do segundo dígito verificador
			soma = 0;
			for (int i = 0; i < 10; i++) {
				soma += numeros[i] * (11 - i);
			}
			resto = soma % 11;
			int digito2 = resto < 2 ? 0 : 11 - resto;

			// Verifica se os dígitos calculados conferem com os informados
			return numeros[9] == digito1 && numeros[10] == digito2;
		} catch (Exception e) {
			return false;
		}
	}

	private static void exibirDadosAluno(Aluno aluno) {
		StringBuilder sb = new StringBuilder();
		sb.append("\n=== DADOS DO ALUNO ===\n");
		sb.append("Nome: ").append(aluno.getNome()).append("\n");
		sb.append("Idade: ").append(aluno.getIdade()).append("\n");
		sb.append("Data de Nascimento: ").append(aluno.getDataNascimento()).append("\n");
		sb.append("RG: ").append(aluno.getRegistroGeral()).append("\n");
		sb.append("CPF: ").append(aluno.getNumeroCpf()).append("\n");
		sb.append("Mãe: ").append(aluno.getNomeMae()).append("\n");
		sb.append("Pai: ").append(aluno.getNomePai() != null ? aluno.getNomePai() : "Não informado").append("\n");
		sb.append("Data de Matrícula: ").append(aluno.getDataMatricula()).append("\n");
		sb.append("Escola: ").append(aluno.getNomeEscola()).append("\n");
		sb.append("Série: ").append(aluno.getSerieMatriculado()).append("\n\n");

		sb.append("=== DISCIPLINAS E NOTAS ===\n");
		aluno.getDisciplinas().forEach(
				d -> sb.append(d.getDisciplina()).append(": ").append(String.format("%.1f", d.getNota())).append("\n"));

		sb.append("\nMédia: ").append(String.format("%.2f", aluno.getMediaNota())).append("\n");
		sb.append("Situação: ").append(aluno.getAlunoAprovado() ? "Aprovado" : "Reprovado").append("\n");

		System.out.println(sb.toString());
		JOptionPane.showMessageDialog(null, sb.toString());
	}
}