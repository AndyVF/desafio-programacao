package com.capgemini;

public class Main {

    public static void main(String[] args) {
        System.out.println("questao 1 do desafio");
        System.out.println(Desafio.imprimeArvore(6));
        System.out.println("questao 2 do desafio");
        System.out.println(Desafio.validaSenha("123@Aa"));
        System.out.println(Desafio.validaSenha("123456"));
        System.out.println(Desafio.validaSenha("1234567"));
        System.out.println("questao 3 do desafio");
        System.out.println(Desafio.calculoAnagrama("ovo"));
        System.out.println(Desafio.calculoAnagrama("rede"));
    }
}
