package cursoJava;

import javax.swing.JOptionPane;

public class calculoMediaMelhorado {

    public static void main(String[] args) {
        try {
            // Solicita as notas
            String nota1 = JOptionPane.showInputDialog("Informe a nota 1 (0-10):");
            String nota2 = JOptionPane.showInputDialog("Informe a nota 2 (0-10):");
            String nota3 = JOptionPane.showInputDialog("Informe a nota 3 (0-10):");
            String nota4 = JOptionPane.showInputDialog("Informe a nota 4 (0-10):");

            // Converte para double
            double dNota1 = Double.parseDouble(nota1);
            double dNota2 = Double.parseDouble(nota2);
            double dNota3 = Double.parseDouble(nota3);
            double dNota4 = Double.parseDouble(nota4);

            // Valida se as notas estão entre 0 e 10
            if (dNota1 < 0 || dNota1 > 10 || dNota2 < 0 || dNota2 > 10 ||
                dNota3 < 0 || dNota3 > 10 || dNota4 < 0 || dNota4 > 10) {
                JOptionPane.showMessageDialog(null, "Notas devem estar entre 0 e 10.");
                return;
            }

            // Calcula a média
            double media = (dNota1 + dNota2 + dNota3 + dNota4) / 4;

            // Define o status com base na média (escala 0-10)
            String status;
            if (media >= 7.0) {
                status = "Aprovado";
            } else if (media >= 5.0) {
                status = "Recuperação";
            } else {
                status = "Reprovado";
            }

            // Exibe o resultado
            JOptionPane.showMessageDialog(null, 
                String.format("Média: %.1f\nStatus: %s", media, status));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Insira apenas números válidos.");
        }
    }
}