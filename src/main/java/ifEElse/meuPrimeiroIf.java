package ifEElse;

public class meuPrimeiroIf {
    public static void main (String[] args){

        /*
        * IF significa:

SE

Imagine:

SE a pessoa tiver 18 anos ou mais
ENTÃO ela pode entrar.

No Java:

if (condicao) {

    // código executado quando a condição for verdadeira

}
        *
        *
        *
        *
        *
        *

       int estoque = 10;
       int quantidade = 30;


        if (estoque >= quantidade){
            System.out.println("PRODUTO DISPONIVEL");
        } else {
            System.out.println("ESTOQUE INSUFICENTE");

        }


        int idade = 5 ;
        boolean possuiIngresso = true ;

        if (idade >= 18 || possuiIngresso) {
            System.out.println(" ENTRADA AUTORIZADA ");
        } else {
            System.out.println(" ENTRADA NÃ0 AUTORIZADA ");
        }

       boolean possuiPix = false ;
       boolean possuiCartao = false;

       if (possuiPix || possuiCartao) {
           System.out.println("PODE REALIZAR O PAGAMENTO ");
       } else {
           System.out.println("NENHUMA FORMA DE PAGAMENTO DISPONIVEL ");
       }


        double nota = 4.9;

        if (nota >= 8){
            System.out.println("APROVADO ");
        }else if(nota >= 5){
            System.out.println("RECUPERACAO ");
        }else {
            System.out.println("REPROVADO ");
        }

        System.out.println();*/

        int statusCode = 500;

        if (statusCode == 200){
            System.out.println("SUCESSO");
        } else if (statusCode == 400){
            System.out.println("REQUISICAO INVALIDA");
        }else if (statusCode == 401) {
            System.out.println("NAO AUTORIZADO");
        } else if (statusCode == 404) {
            System.out.println("NAO ENCONTRADO");
        } else if (statusCode == 500) {
            System.out.println("FORA DO AR");
        } else {
            System.out.println("Status nao mapeado");
        }


    }
}