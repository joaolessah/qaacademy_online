package algoritmos.Medio;

import javax.swing.*;

public class Exercicio07_medium {
    public static void main(String[] args) {
        String meses [] = new String[12];

        for (int i = 0 ; i < 12; i++){
            meses [i] = JOptionPane.showInputDialog("Digite o nome do mês");
        }

        for (int i = 0; i < 12; i++){
            System.out.println(meses[i]);
        }
    }
}
