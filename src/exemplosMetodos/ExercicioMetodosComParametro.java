package exemplosMetodos;

public class ExercicioMetodosComParametro {

    public static void main(String[] args) {

        System.out.println(exibirNomeEIdade(33, "João"));
        System.out.println(retornarPalavra("testes"));
        System.out.println(retornarDobro(4));
        System.out.println(retornarNomeSobrenome("João", "Lessa"));
        System.out.println( retornarSalario(1200.40));

        exibirNomeEIdadeSemRetorno(25, "Joana");
        retornarPalavraSemRetorno("teste sem retorno");
        retornarDobroSemRetorno(8);
        retornarNomeSobrenomeSemRetorno("João sem retorno", "Lessa");
        retornarSalarioSemRetorno(12312.44);


    }

    public static String exibirNomeEIdade(int idade, String nome){
        return "Nome: " + nome + "- Idade: " + idade;
    }
    public static String retornarPalavra (String palavra){
        return palavra;
    }

    public static int retornarDobro (int numero){
        return  numero * 2;
    }
    public static String retornarNomeSobrenome (String nome, String sobrenome){
        return  nome + " " + sobrenome;
    }

    public static double retornarSalario(double salario){
        return salario;
    }

    public static void exibirNomeEIdadeSemRetorno(int idade, String nome){
        System.out.println("Nome: " + nome + "- Idade: " + idade);
    }
    public static void retornarPalavraSemRetorno (String palavra){
        System.out.println(palavra);
    }

    public static void retornarDobroSemRetorno (int numero){
        System.out.println(numero * 2);
    }
    public static void retornarNomeSobrenomeSemRetorno (String nome, String sobrenome){
        System.out.println(nome + " " + sobrenome);
    }

    public static void retornarSalarioSemRetorno (double salario){
        System.out.println(salario);
    }
}
