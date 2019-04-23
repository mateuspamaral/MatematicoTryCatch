package br.com.digitalhouse;

public class Main {
    public static void main(String[] args) {
        CalculoMatematico calculo1 = new CalculoMatematico();


        try {
            calculo1.divisao(4, 0);
        }catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }


    }
}
