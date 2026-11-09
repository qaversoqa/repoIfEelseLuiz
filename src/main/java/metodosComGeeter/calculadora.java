package metodosComGeeter;

import java.util.Scanner;

import static metodosComGeeter.engrenagemDaCauculadora.*;

public class calculadora {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("prencher Numero :");
        int n1 = sc.nextInt();

        System.out.println("prencher segundo numero : ");
        int n2 = sc.nextInt();

        sc.close();

        engrenagemDaCauculadora eng = new engrenagemDaCauculadora();


        // Chamar metodos
        System.out.println("Soma: " + somar(n1 , n2));
        System.out.println("Subtrair : " + subtrair(n1,n2));
        System.out.println("Divisao : " + dividir(n1,n2));
        System.out.println("multiplicacao : " + mulitiplicar(n1,n2));
        //System.out.println("Multiplacao" + mulitiplicar());

    }

}
