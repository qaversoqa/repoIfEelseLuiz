package switchCase;

import java.util.Scanner;

public class meuPrimeiroSwitchCase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // SwitchCase Opcoes onde ha muitos casos

        System.out.println("Escolha os sabores de pizza abaixo");
        System.out.println("1 calabresa");
        System.out.println("2 Mussarela");
        System.out.println("3 frango com catupiry");
        System.out.println("4 alho e oleo");

        String opcao = sc.nextLine().trim();


        switch (opcao) {
            case "calabresa":
                System.out.println("Voce escolheu o sabor de calabresa");
            break;
            case "mussarela":
                System.out.println("Voce escolheu o sabor de Mussarela");
                break;
            case "frango":
                System.out.println("Voce escolheu o sabor de frango com catupiry");
                break;
            case "alho":
                System.out.println("Voce escolheu o sabor de alho e oleo");
                break;
            default:
                System.out.println("Opcao invalida");
        }



    }





}
