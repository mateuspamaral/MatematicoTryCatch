package br.com.digitalhouse;

import java.util.concurrent.ExecutionException;

public class CalculoMatematico {
    public Integer divisao(Integer numA, Integer numB) throws ArithmeticException{
        if (numB == 0) {
            throw new ArithmeticException("Não pode ser dividido por zero.");
        }
        return numA/numB;
    }
}
