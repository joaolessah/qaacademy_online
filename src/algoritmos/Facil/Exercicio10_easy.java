package algoritmos.Facil;

import javax.swing.*;

public class Exercicio10_easy {

    public static double valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser investido"));

    public static double valorJuros = 0.0;

    public static void valorInvestido (double valorInvestimento){
        System.out.println("O valor investido foi: " + valorInvestimento);
    }

    public static void valorDoJuros (double valorJuros){
        System.out.println("O valor do juros foi: " + valorJuros);
    }

    public static void valorComJuros (double valorInvestimento){
        System.out.println("O total com juros foi: " + (valorJuros + valorInvestimento));
    }

    public static void calculoInvestimento(double valorInvestimento){
        int anos = 1;
        while(anos <= 10){
            valorJuros += valorInvestimento * 0.05;
            anos++;
        }
    }
}
