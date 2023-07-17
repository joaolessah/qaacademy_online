package algoritmos.Medio;


import javax.swing.*;

public class Exercicio05_medium {
    public static void main(String[] args) {
        int numeroDigitado, menorNumero = 0, i=1;
        while(i <=5){
            numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
            if(numeroDigitado < menorNumero || i == 1){
                menorNumero = numeroDigitado;
            }
            i++;
        }
        System.out.println("O número: " + menorNumero + " é o menor");

    }
}
