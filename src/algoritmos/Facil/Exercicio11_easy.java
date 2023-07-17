package algoritmos.Facil;

import javax.swing.*;

public class Exercicio11_easy {
    public static void main(String[] args) {

        int numeroDigitado, cont, soma;
        numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um núemero"));
        soma = numeroDigitado;
        cont = 1;

        while (cont <= 100){
            soma += 2;
            System.out.println("O total somado é: " + soma);
            cont ++;
        }


    }
}
