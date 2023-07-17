package algoritmos.Facil;

import javax.swing.*;

public class Exercicio05_easy {

    public static void main(String[] args) {

        int primeiroNumero, segundoNumero, terceiroNumero;

        primeiroNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
        segundoNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
        terceiroNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número"));

        System.out.println("A soma dos três números digitados é: " + (primeiroNumero + segundoNumero + terceiroNumero));
        System.out.println("A subtração dos três números digitados é: " + (primeiroNumero - segundoNumero - terceiroNumero));
        System.out.println("A multiplicação dos três números digitados é: " + (primeiroNumero * segundoNumero * terceiroNumero));
        System.out.println("A média dos três números digitados é: " + ((primeiroNumero + segundoNumero + terceiroNumero)/3));

    }
}
