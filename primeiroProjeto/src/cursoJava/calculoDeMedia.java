
package cursoJava;

import javax.swing.JOptionPane;

public class calculoDeMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nota1 = JOptionPane.showInputDialog("Informe a nota1");
		String nota2 = JOptionPane.showInputDialog("Informe a nota2");
		String nota3 = JOptionPane.showInputDialog("Informe a nota3");
		String nota4 = JOptionPane.showInputDialog("Informe a nota4");

		double dNota1 = Double.parseDouble(nota1);
		double dNota2 = Double.parseDouble(nota2);
		double dNota3 = Double.parseDouble(nota3);
		double dNota4 = Double.parseDouble(nota4);

		double media = (dNota1 + dNota2 + dNota3 + dNota4) / 4;

		/* media para aprovação é 7.0 */
		if (media >= 70) {
			JOptionPane.showMessageDialog(null, "Aluno está aprovado com média de: " + media);
		} else if (media >= 50) { // Exemplo: recuperação se média entre 5.0 e 7.0
			JOptionPane.showMessageDialog(null, "Aluno em recuperação com média de: " + media);
		} else {
			JOptionPane.showMessageDialog(null, "Aluno está reprovado com média de: " + media);
		}
	}
}