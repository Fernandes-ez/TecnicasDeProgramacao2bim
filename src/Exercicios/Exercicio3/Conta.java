package Exercicios.Exercicio3;

import java.util.Scanner;

public class Conta {
    public String titular, agencia;
    public int numeroConta;
    public double saldo = 0, valor;

    public void sacar(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insra o valor que deseja sacar: ");
        valor = scan.nextDouble();
        if(valor>saldo){
            System.out.println("Valor indisponível.");
        }else{
            saldo -= valor;
        }
    }
    public void depositar(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o valor a depositar: ");
        valor = scan.nextDouble();
        saldo += valor;
    }
}
