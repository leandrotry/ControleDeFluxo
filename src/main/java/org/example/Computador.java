package org.example;

public class Computador {
    private int numero1;
    private int numero2;

    public Computador(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    public void contar() throws ParametrosInvalidosException{
        if(numero1 > numero2){
            throw new ParametrosInvalidosException();
        }
        int contagem = numero2 - numero1;
        for (int x = 1; x <= contagem; x++ ){
            System.out.println("Imprimindo o número " + x);
        }
    }
}
