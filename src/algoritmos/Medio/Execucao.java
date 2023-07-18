package algoritmos.Medio;

import javax.swing.JOptionPane;

public class Execucao {
    public static void main(String[] args) {

    Exercicio07_medium exercicio07_medium = new Exercicio07_medium();

    String [] vetorMeses = exercicio07_medium.criaVetorMeses();
    
    exercicio07_medium.imprimeValoresVetor(vetorMeses);
    }
}
