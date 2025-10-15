import javax.swing.JOptionPane;

public class CalculadoraSimples {
    public static void main(String[] args) {
        try {
            // Leitura dos dois números
            double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
            double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));

            // Opções de operação
            String[] opcoes = {"+", "-", "×", "÷"};
            int escolha = JOptionPane.showOptionDialog(
                    null,
                    "Escolha a operação:",
                    "Calculadora Simples",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]
            );

            double resultado = 0;
            boolean valido = true;

            // Realiza a operação escolhida
            switch (escolha) {
                case 0:
                    resultado = num1 + num2;
                    break;
                case 1:
                    resultado = num1 - num2;
                    break;
                case 2:
                    resultado = num1 * num2;
                    break;
                case 3:
                    if (num2 == 0) {
                        JOptionPane.showMessageDialog(null, "Erro: divisão por zero não é permitida!");
                        valido = false;
                    } else {
                        resultado = num1 / num2;
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Nenhuma operação selecionada.");
                    valido = false;
            }

            // Exibe o resultado final
            if (valido) {
                JOptionPane.showMessageDialog(null, 
                        "Resultado: " + resultado,
                        "Resultado da Operação",
                        JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, 
                    "Erro: insira apenas números válidos!", 
                    "Entrada inválida", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
