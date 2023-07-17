package algoritmos.Facil;

import javax.swing.*;

public class Exercicio09_easy {
    public static void main(String[] args) {
        int num, i, resultado;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 a 10"));
        i = 1;

        while(i <= 10){
            resultado = num * i;
            System.out.println( num + "x" + i + " = " + resultado);
            i++;
        }

    }
}
