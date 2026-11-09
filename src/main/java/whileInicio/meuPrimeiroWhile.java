package whileInicio;

import java.util.Scanner;

public class meuPrimeiroWhile {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        /*
        System.out.println(" Senha :");
        String senha = sc.nextLine();

        while (!senha.equals("1234")) {
            System.out.println("Senha incorreta");
            System.out.println("senha: ");
            senha = sc.nextLine();
        }

        System.out.println("Acesso liberado");
        sc.close();
        */
        System.out.print("Digite a senha do cartão: ");
        String senha = sc.nextLine();

        // ===== LÓGICA =====
        int tentativas = 1;          // contador: já usou 1 tentativa
        int limite = 15;              // máximo de tentativas

        // repete ENQUANTO a senha estiver errada E ainda tiver tentativas
        while (!senha.equals("1234") && tentativas < limite) {
            int restantes = limite - tentativas;
            System.out.println("Senha incorreta! Tentativas restantes: " + restantes);

            System.out.print("Digite a senha do cartão: ");
            senha = sc.nextLine();   // lê de novo DENTRO do while

            tentativas++;            // soma 1 ao contador
        }

        // saiu do while: ou acertou, ou acabaram as tentativas
        if (senha.equals("1234")) {
            System.out.println("Compra aprovada!");
        } else {
            System.out.println("Cartão bloqueado! Procure seu banco.");
        }

        sc.close();


    }
}
