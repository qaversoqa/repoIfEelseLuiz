package scanner;

import java.util.Scanner;

public class evolucaoScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*

        System.out.println("Digite Sua Idade ?");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("Acesso Liberado");
        } else {
            System.out.println("Acesso negado ");
        }

        sc.close();




        System.out.println("Tem Cupom ? (true/false) : ");
        boolean temCupom = sc.nextBoolean();

        if (temCupom) {
            System.out.println("Desconto Aplicado");
        } else {
            System.out.println("Sem desconto");
        }
        sc.close();


        System.out.println("É Maior de 18 anos ");
        String cor = sc.nextLine();

        if (cor.equals("Sim")) {
            System.out.println("Pode passar");
        }else{
            System.out.println("PARE ! ");
        }



        System.out.println("Qual seu nome");
        String nome = sc.nextLine();

        System.out.println("Qual Seu Login ? ");
        String login = sc.nextLine();


        System.out.println("Qual sua Senha ? ");
        System.out.println("A senha tem que deve conter letra maiuscula e minuscula");
        String senha = sc.nextLine();

        if (login.equalsIgnoreCase("Admin") && senha.equalsIgnoreCase("Fc1234@")){
            System.out.println("Bem vindo " + nome + " !" );
        }else {
            System.out.println("Usuario e senha invalido ! ");
        }

        equals =  diferencia maiúsculas de minúsculas
        equalsIgnoreCase: ignora maiúsculas e minúsculas
        trim + equalsIgnoreCase: também ignora espaços nas pontas

        System.out.println("Cor do semáfaro: ");
        String cor = sc.nextLine();

        if (cor.trim().equalsIgnoreCase("Amarelo")){
            System.out.println("Cor correta ");
        } else {
            System.out.println("Cor incorreta ");
        }


        System.out.println("Cor do semáfaro: ");
        String cor = sc.nextLine();

        if (!cor.trim().equalsIgnoreCase("Vermelho")){
            System.out.println("Nao é vermelho");
        } else {
            System.out.println("é vermelho ");
        }



        System.out.println("Senha : ");
        String senha = sc.nextLine();

        System.out.println("Valor do Saque : ");
        double valor = sc.nextDouble();

       sc.close();

        double saldo = 500.0;

        if (senha.equals("1234")) {
            if(valor <= 0) {
                System.out.println("Valor Invalido");
            } else if (valor <= saldo ) {
                saldo = saldo - valor;
                System.out.println("Saque Realizado . seu saldo é de "  + saldo);
            }else {
                System.out.println("Saldo insuficiente");
            }
        }else {
            System.out.println("Senha incorreta !");
        }





        // trim() remove espacos



        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        sc.close();

        // ===== LÓGICA =====
        // trim() remove espaços do início e do fim
        String nomeLimpo = nome.trim();

        System.out.println("Antes: [" + nome + "]");
        System.out.println("Depois: [" + nomeLimpo + "]");






        // isEmpty() valida se o campo foi vazio

        System.out.print("Digite seu e-mail: ");
        String email = sc.nextLine();

        sc.close();

        // ===== LÓGICA =====
        // isEmpty() valida se o campo foi vazio
        if (email.isEmpty()) {
            System.out.println("Campo obrigatório!");
        } else {
            System.out.println("E-mail recebido: " + email);
        }


        // equalsIgnoreCase() ignora letra maiusculas e minusculas

        System.out.print("Deseja continuar? (sim/nao): ");
        String resposta = sc.nextLine();

        sc.close();

        // ===== LÓGICA =====
        // equalsIgnoreCase() ignora letras maiúsculas e minúsculas
        if (resposta.equalsIgnoreCase("sim")) {
            System.out.println("Continuando...");
        } else {
            System.out.println("Encerrado.");
        }



        // equals tem que ser literamte igual
        System.out.print("Digite a senha: ");
        String senha = sc.nextLine();

        sc.close();

        // ===== LÓGICA =====
        // equals() tem que ser literalmente igual
        if (senha.equals("teste")) {
            System.out.println("Acesso liberado");
        } else {
            System.out.println("Senha incorreta");
        }



        // toUpperCase() transforma em maiusculas

        System.out.print("Digite a sigla do seu estado: ");
        String uf = sc.nextLine();

        sc.close();

        // ===== LÓGICA =====
        // toUpperCase() transforma em maiúsculas
        String ufMaiuscula = uf.toUpperCase();

        System.out.println("Estado: " + ufMaiuscula);



        // toLowerCase() transforma em minusculas

        System.out.print("Digite seu e-mail: ");
        String email = sc.nextLine();

        sc.close();

        // ===== LÓGICA =====
        // toLowerCase() transforma em minúsculas
        String emailPadrao = email.toLowerCase();

        System.out.println("E-mail salvo: " + emailPadrao);
   */

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("E-mail: ");
        String email = sc.nextLine();

        System.out.print("Estado (UF): ");
        String uf = sc.nextLine();

        System.out.print("Senha: ");
        String senha = sc.nextLine();

        System.out.print("Aceita os termos? (sim/nao): ");
        String termos = sc.nextLine();

        sc.close();

        // ===== LÓGICA =====
        // 1. trim() remove espaços
        nome = nome.trim();
        email = email.trim();
        uf = uf.trim();

        // 2. isEmpty() valida se o campo foi vazio
        if (nome.isEmpty() || email.isEmpty() || uf.isEmpty()) {
            System.out.println("Preencha todos os campos!");
        } else if (!termos.trim().equalsIgnoreCase("sim")) {
            // 3. equalsIgnoreCase() ignora maiúsculas e minúsculas
            System.out.println("É preciso aceitar os termos.");
        } else if (!senha.equals("12345")) {
            // 4. equals() tem que ser literalmente igual
            System.out.println("Senha incorreta.");
        } else {
            // 5. toUpperCase() transforma em maiúsculas
            // 6. toLowerCase() transforma em minúsculas
            System.out.println("Cadastro realizado!");
            System.out.println("Nome: " + nome.toUpperCase());
            System.out.println("E-mail: " + email.toLowerCase());
            System.out.println("Estado: " + uf.toUpperCase());
        }










    }
}
