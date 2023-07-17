package algoritmos.Facil;

import javax.swing.*;

public class Exercicio08_easy {

    public static void main(String[] args) {

        double salarioBruto, salarioLiquido, IR;
        IR = 0.0;
        salarioLiquido = 0.0;
        salarioBruto = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário bruto"));

        if(salarioBruto <= 1903.98){
            IR = 0.0;
            salarioLiquido = salarioBruto;
        }
        if(salarioBruto >= 1903.99 && salarioBruto <= 2826.65){
            IR = (salarioBruto * 0.075) - 142.8;
            salarioLiquido = salarioBruto - IR;

        }
        if(salarioBruto >= 2826.66 && salarioBruto <= 3751.05){
            IR = (salarioBruto * 0.15) - 354.8;
            salarioLiquido = salarioBruto - IR;

        }
        if(salarioBruto >= 3751.06 && salarioBruto <= 4664.68){
            IR = (salarioBruto * 0.225) - 636.13;
            salarioLiquido = salarioBruto - IR;

        }
        if(salarioBruto > 4664.68){
            IR = (salarioBruto * 0.275) - 869.36;
            salarioLiquido = salarioBruto - IR;

        }

        System.out.println("O salário bruto é: " + salarioBruto);
        System.out.println("O salário líquido é: " + salarioLiquido);
        System.out.println("O IR é: " + IR);

    }
}
