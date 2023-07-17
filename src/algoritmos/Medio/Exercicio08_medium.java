
package algoritmos.Medio;

import javax.swing.*;

public class Exercicio08_medium {
    public static void main(String[] args) {
        String nomes [] = new String [5];
        int numeracaoAluno [] = new int [5];

        for(int i = 0; i < 5; i++){
            nomes [i] = JOptionPane.showInputDialog("Digite o nome do aluno " + (i + 1));
            numeracaoAluno [i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do aluno: "));
        }

        for(int i = 0; i < 5; i++){
            System.out.println(numeracaoAluno[i] + "- " + nomes[i]);
        }

    }
}
