package cursoJava;

import javax.swing.JOptionPane;

public class opcaoDeConfirmacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros?");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas?");

		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);

		int divisao = (int) (carroNumero / pessoaNumero);

		double resto = carroNumero % pessoaNumero;

		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão?");

		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "Divisão para pessoas deu " + divisao);

		}

		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado do resto?");

		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "O resto da divisão é: " + resto);

		}

	}
}
