package cursoJava.executavel;

import cursoJava.classes.Aluno;
import cursoJava.classes.Diretor;
import cursoJava.classes.Pessoa;
import cursoJava.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setNome("Leandro de Barros");
		aluno.setIdade(16);

		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("05165416763");
		diretor.setIdade(58);

		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administração");
		secretario.setIdade(31);

		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);

		System.out.println(aluno.pessoaMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());

		Aluno aluno2 = new Aluno();

	}

}
