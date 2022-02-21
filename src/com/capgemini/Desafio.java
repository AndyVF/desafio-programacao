package com.capgemini;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Desafio {
    public static boolean validaSenha(String senha) {

        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[!@#$%^&*()-+])"
                + "(?=\\S+$).{6}$";

        Pattern p = Pattern.compile(regex);

        if (senha == null) {
            return false;
        }

        Matcher m = p.matcher(senha);

        return m.matches();
    }

    private static String Digite_a_palavra(String palavraRecebida) {
        while (palavraRecebida.length() <= 2) {
           System.out.println("Digite uma palavra de no minimo 3 caracteres");
        }
        return palavraRecebida;
    }

    private static boolean Mostra(char[] vetor) {
       System.out.println(vetor.length);
       return true;
    }

    private static String Retira_Espaco(String palavra) {
        String alterada = "", interna = (palavra).trim();
        char c;

        for (int i = 0; i < interna.length(); i++) {
            c = interna.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                alterada += c;
            }
        }

        return alterada;
    }

    public static int[] pesquisaLetraRepetida(String palavra){

        char[] charPalavra = palavra.toCharArray();
        int[] resultado = new int[palavra.length()];

        if(palavra.length() >= 3) {
            for(int i = 0; i < palavra.length(); i++){
                for(int j = 0; j < palavra.length(); j++){
                    if(charPalavra[i] == charPalavra[j]){
                        resultado[i] += 1;
                    }
                }
            }

            return resultado;
        } else {
            System.out.println("Coloque uma palavra com mais de 3 letras");
        }

        return resultado;
    }

    public static int calculaFatorial(int numero){
        int totalFatorial = 1;

        for(int i = numero; i >= 2; i--){

            if(i == numero){
                totalFatorial = numero * (numero-1);
            }
            else{
                totalFatorial = totalFatorial  * (i-1);
            }

        }
        return totalFatorial;
    }

    public static int calculoPermutacao(int[] letrasRepetidas, String palavra){

        int divisor = 0;
        int dividendo = 0;

        for(int i = 0; i < letrasRepetidas.length; i++){
            dividendo += calculaFatorial(letrasRepetidas[i]);
        }

        divisor = calculaFatorial(palavra.length());

        return divisor / dividendo;
    }

    public static int calculoAnagrama(String palavra){
        int[] letrasRepetidas = pesquisaLetraRepetida(palavra);
        return calculoPermutacao(letrasRepetidas, palavra);
    }

    public static String imprimeArvore(int nivel) {
        String arvore = "";
        for(int i = 1;i <= nivel;i++){
            for (int j = (nivel - i);j >= 1; j--)
                arvore += (" ");
            for(int j = 1;j <= i; j++)
                arvore += ("*");
            arvore += ("\n");
        }
        return arvore;
    }
}
