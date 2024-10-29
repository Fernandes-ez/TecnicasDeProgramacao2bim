package aula29deOutubro;

import java.util.Scanner;

public class Erros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        try{
            System.out.println("Digite um número inteiro:");
            n = entrada.nextInt();
            System.out.println("Você digitou "+n);
        }catch (Exception e){
            System.out.println("Valor não é inteiro!");""
        }



    }
}
