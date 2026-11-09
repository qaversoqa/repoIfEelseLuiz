package metodosComGeeter;

public class engrenagemDaCauculadora {


    private int resultado;


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

    // GETTER ou Ponte que conecta as classes

    public int getResultado() {
        return resultado;
    }


}
