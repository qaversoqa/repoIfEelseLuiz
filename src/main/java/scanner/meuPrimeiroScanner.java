package scanner;

import java.util.Scanner;

public class meuPrimeiroScanner {
    public static void main (String[] args) {

        /**
         *Até aqui mudamos idade, estoque e status editando o código.
         * Agora vamos perguntar esses valores diretamente ao usuário.
         *
         * Scanner é a ferramenta que lê o que foi digitado no console.
         * import java.util.Scanner;
         * Scanner entrada = new Scanner(System.in);
         * entrada.nextLine() — texto
         * entrada.nextInt() — inteiro
         * entrada.nextDouble() — decimal
         * entrada.nextBoolean() — true/false
         * entrada.close() — encerra o Scanner
         *
         *
         *
         *
         *
         *
         *
         *
         *
         *


        Scanner escrever = new Scanner(System.in);

        System.out.println("Qual seu nome ? ");
        String nome = escrever.nextLine();

        System.out.println( "Ola , " + nome + "!");
        escrever.close();




        Scanner escrever = new Scanner(System.in);

        System.out.println("Qual sua idade ?");
        int idade = escrever.nextInt();

        if (idade >= 18) {
            System.out.println("Entrada Autorizada ");
        } else {
            System.out.println("Entrada nao autorizada");
        }

        escrever.close();



        Scanner escrever = new Scanner(System.in);

        System.out.println("Pagamento Aprovado");

        boolean aprovado = escrever.nextBoolean();

        if (aprovado) {
            System.out.println("Pagamento Confirmado");
        } else {
            System.out.println("Pagamento Recusado");
        }

        escrever.close();
*/


        Scanner escrever = new Scanner(System.in);
        System.out.println("QUAL NOTA? ");
        double nota = escrever.nextDouble();

        if (nota >= 8){
            System.out.println("APROVADO ");
        }else if(nota >= 5){
            System.out.println("RECUPERACAO ");
        }else {
            System.out.println("REPROVADO ");
        }
    }




}
