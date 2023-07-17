package algoritmos.Facil;

import javax.swing.*;

public class Exercicio10_easy {
    public static void main(String[] args) {
        double valorInvestimento, valorJuros;
        valorJuros = 0.0;
        valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser investido"));
        int anos = 1;

        //valor juros vai ser valorInvestido * 0,05 iterado

        while(anos <= 10){
            valorJuros += valorInvestimento * 0.05;
            anos++;
        }

        System.out.println("O valor investido foi: " + valorInvestimento);
        System.out.println("O valor do juros foi: " + valorJuros);
        System.out.println("O total com juros foi: " + (valorJuros + valorInvestimento));

    }
}
