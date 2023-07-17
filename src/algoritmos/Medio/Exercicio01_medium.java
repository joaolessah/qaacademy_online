package algoritmos.Medio;

public class Exercicio01_medium {
    public static void main(String[] args) {

        int cont = 1;

        while (cont <= 100){
            if (cont % 2 == 0){
                System.out.println("O número: " + cont + " é par.");
            }
            else{
                System.out.println("O número: " + cont + " é impar.");

            }
            cont++;
        }
    }
}
