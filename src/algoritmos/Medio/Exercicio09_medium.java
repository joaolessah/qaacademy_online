package algoritmos.Medio;

import javax.swing.*;

public class Exercicio09_medium {
    public static void main(String[] args) {
        int elemento  = Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento que quer saber o fibonaccit"));
        int vet [] = new int [elemento];
        int cont = 2;

        vet[0] = 0;
        vet[1] = 1;

        while(cont < elemento){
            vet[cont] = vet[cont - 1] + vet[cont - 2];
            cont++;
        }

        cont = 0;

        while (cont < elemento){
            System.out.println(vet[cont]);
            cont++;
        }

    }
}
