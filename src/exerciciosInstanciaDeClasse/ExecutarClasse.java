package exerciciosInstanciaDeClasse;

public class ExecutarClasse {
    public static void main(String[] args) {
        Cachorro dog1 = new Cachorro();
        System.out.println("O nome do cachorro é: " + dog1.nomeCachorro);
        System.out.println("O idade do cachorro é: " + dog1.idadeCachorro);
        dog1.exibirIdadeCachorro();
        dog1.exibirNomeCachorro();
        dog1.exibirIdadeENomeCachorro();

    }
}
