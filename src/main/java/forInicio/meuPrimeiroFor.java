package forInicio;

import java.util.Scanner;

public class meuPrimeiroFor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();

        sc.close();


        for (int i = 0; i <= 1046540; i++) {
            System.out.println(" x " + i + " = " + (numero * i));
        }




    }
}
