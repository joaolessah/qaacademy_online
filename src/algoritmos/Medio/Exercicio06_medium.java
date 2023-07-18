package algoritmos.Medio;


import javax.swing.*;

public class Exercicio06_medium {
    public static int calculaFatotial(int fatorial) {

        int i;
        i = fatorial;

        while(i > 1){
            fatorial = fatorial * (i - 1);
            i--;
        }

       return fatorial;
    }
}
