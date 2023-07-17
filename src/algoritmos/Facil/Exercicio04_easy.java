package algoritmos.Facil;

import javax.swing.*;


public class Exercicio04_easy {
    public static void main(String[] args) {

        // programa para receber, converter, calcular e exibir dados

        int numeroDigitado, resultado;

        numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        resultado = numeroDigitado * 2;

        System.out.printf("O dobro do número digitado é: " + resultado);

    }
}
