package ark08;

import javax.swing.JOptionPane;

public class ARK08 {

    public static void main(String[] args) {
        int numero1 = 0;
        int numero2 = 0;
        int resutado;

        try {
            numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valor Inválido");
            System.exit(0);
        }

        try {
            numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valor Inválido");
            System.exit(0);
        }

        String opcao = JOptionPane.showInputDialog("Informe um sinal de operação(+, -, * ou /) :");

        switch (opcao) {
            case "+":
                resutado = numero1 + numero2;
                JOptionPane.showMessageDialog(null, "O resutado é : " + resutado);
                break;
            case "-":
                resutado = numero1 - numero2;
                JOptionPane.showMessageDialog(null, "O resutado é : " + resutado);
                break;
            case "*":
                resutado = numero1 * numero2;
                JOptionPane.showMessageDialog(null, "O resutado é : " + resutado);
                break;
            case "/":
                resutado = numero1 / numero2;
                JOptionPane.showMessageDialog(null, "O resutado é : " + resutado);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Valor Inválido");
                break;
        }
    }
}