package exerciciosInstanciaDeClasse;

public class Cachorro {
    public String nomeCachorro = "Fofinho";
    public int idadeCachorro = 8;

    public void exibirNomeCachorro (){
        System.out.println(nomeCachorro);
    }

    public void exibirIdadeCachorro (){
        System.out.println(idadeCachorro);
    }

    public  void exibirIdadeENomeCachorro(){
        System.out.println("O nome do cachorro é: " + nomeCachorro + " e a idade é " + idadeCachorro + " anos.");
    }
}
