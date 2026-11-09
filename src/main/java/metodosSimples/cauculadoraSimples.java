package metodosSimples;

import java.util.Scanner;

public class cauculadoraSimples {


    // METODOS
    public static int somar(int a , int b){
            return a + b;
    }

    public static int subtrair(int a , int b){
        return a - b;
    }

    public static int mulitiplicar(int a , int b){
        return a * b;
    }

    public static int dividir(int a , int b){
        return a / b;
    }

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("prencher Numero :");
        int n1 = sc.nextInt();

        System.out.println("prencher segundo numero : ");
        int n2 = sc.nextInt();

        sc.close();


        // Chamar metodos
        System.out.println("Soma: " + somar(n1 , n2));
        System.out.println("Subtrair : " + subtrair(n1,n2));
        System.out.println("Divisao : " + dividir(n1,n2));
        System.out.println("multiplicacao : " + mulitiplicar(n1,n2));






    }


}
