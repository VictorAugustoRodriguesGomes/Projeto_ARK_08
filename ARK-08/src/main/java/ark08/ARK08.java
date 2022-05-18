package ark08;

import javax.swing.JOptionPane;

public class ARK08 {

    public static void main(String[] args) {
        int resutado;
        int numero1;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        int numero2;
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        String opcao = JOptionPane.showInputDialog("Informe um sinal de operação(+, -, * ou /) :");
        switch (opcao) {
            case "+":
                resutado = numero1 + numero2;
                JOptionPane.showMessageDialog(null, "O resutado é :" + resutado);
                break;
            case "-":
                resutado = numero1 - numero2;
                JOptionPane.showMessageDialog(null, "O resutado é :" + resutado);
                break;
            case "*":
                resutado = numero1 * numero2;
                JOptionPane.showMessageDialog(null, "O resutado é :" + resutado);
                break;
            case "/":
                resutado = numero1 / numero2;
                JOptionPane.showMessageDialog(null, "O resutado é :" + resutado);
                break;
            default:
                JOptionPane.showMessageDialog(null, "valor invalido");
                break;
        }
    }
}
