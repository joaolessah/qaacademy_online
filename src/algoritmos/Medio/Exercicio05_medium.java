package algoritmos.Medio;


import javax.swing.*;

public class Exercicio05_medium {
    public int verificaMenorNumero (){

        int numeroDigitado;
        int menorNumero = 0, i=1;
        while(i <=5){
            
            numeroDigitado = lerNumeroDigitado();
        
            if(numeroDigitado < menorNumero || i == 1){
                menorNumero = numeroDigitado;
            }
            i++;
        }
       
        return menorNumero;
    }

    private int lerNumeroDigitado() {

        int numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        return numeroDigitado;
    }
}
