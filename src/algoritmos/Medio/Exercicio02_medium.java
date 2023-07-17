package algoritmos.Medio;


import javax.swing.*;

public class Exercicio02_medium {
    public static void main(String[] args) {

        double valorInvestimento, taxaDeJuros, totalAtualizadoJuros;
        taxaDeJuros = 0.05;
        valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento: "));
        totalAtualizadoJuros = valorInvestimento;
        int tempoInvestido, cont;
        tempoInvestido = 10;
        cont = 1;

        while (cont <= tempoInvestido){
            totalAtualizadoJuros = (totalAtualizadoJuros * taxaDeJuros) + totalAtualizadoJuros;
            cont++;
        }

        System.out.println("O valor do investimento são: " + valorInvestimento);
        System.out.println("O valor dos juros são " + (totalAtualizadoJuros - valorInvestimento) );
        System.out.println("O vlaor total do investimento: " + totalAtualizadoJuros);
    }
}
