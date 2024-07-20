public class Operadores {
    public static void main(String[] args) {
        // String nomeCompleto = "LINGUAGEM" + "JAVA";

        // System.out.println(nomeCompleto);

        // String concatenacao = "?";

        // concatenacao = 1 + 1 + 1 + "1";
        // System.out.println(concatenacao);

        // concatenacao = 1 + "1" + 1 + 1;
        // System.out.println(concatenacao);

        // concatenacao = "1" + 1 + 1 + 1;
        // System.out.println(concatenacao);

        // concatenacao = "1" + (1 + 1 + 1);
        // System.out.println(concatenacao);

        // int numero = 5;

        // numero = -numero;

        // System.out.println(numero);

        // numero = numero * -1;

        // System.out.println(numero);

        // int numero = 5;

        // x repetição
        // numero++;

        // System.out.println(++numero);

        // System.out.println(numero);

        // boolean variavel = true;

        // System.out.println(!variavel);

        // variavel = !variavel;
        // System.out.println(variavel);

        // String nomeUm = "Paulo";
        // String nomeDois = "Paulo";

        // System.out.println(nomeUm == nomeDois);

        // int a = 2;
        // int b = 2;
        // String resultado = a == b ? "verdadeiro" : "falso";

        // System.out.println(resultado);

        // int numero1 = 1;
        // int numero2 = 2;

        // boolean simNao = numero1 == numero2;

        // if (numero1 < numero2) {
        // System.out.println("a nossa condição é verdadeira");
        // }

        // System.out.println("numeroUm é igual a numeroDois? " + simNao);

        // simNao = numero1 != numero2;

        // System.out.println("numeroUm é diferente de numeroDois? " + simNao);
        // simNao = numero1 > numero2;

        // System.out.println("numeroUm é maior que numeroDois? " + simNao);

        boolean condicao1 = true;
        boolean condicao2 = true;

        // && (E) - Ambas as condições devem ser verdadeiras
        // || (OU) - Uma das condições deve ser verdadeira
        // ! (NEGAÇÃO) - Inverte a verdadeiro para falso e vice-versa

        if (condicao1 && (7 > 4)) {
            System.out.println("Ambas as condições são verdadeiras");
        }

        if (condicao1 || condicao2) {
            System.out.println("Pelo menos uma das condições é verdadeira");
        }

        System.out.println("fim");

    }
}
