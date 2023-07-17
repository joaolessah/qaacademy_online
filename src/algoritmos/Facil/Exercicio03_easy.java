package algoritmos.Facil;

import javax.swing.JOptionPane;

public class Exercicio03_easy {
    
    static String primeiroValor, segundoValor;

    public static void main(String[] args) {
        // programa para receceber dados e mostrar dados

        primeiroValor = JOptionPane.showInputDialog("Digite o primeiro valor");
        segundoValor = JOptionPane.showInputDialog("Digite o segundo valor");

        System.out.println("Primeiro valor digitado: " + segundoValor);
        System.out.println("Segundo valor digitado: " + primeiroValor);

    }
}
