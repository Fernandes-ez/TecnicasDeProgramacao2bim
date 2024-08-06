package Exercicios.Exercicio2;

import java.util.Scanner;

public class Funcionario {
    public int codigoFunc;
    public String nome;
    public String cargo;
    public double salarioBruto;
    public void inserirDados(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira seu nome: ");
        nome = scan.nextLine();
        System.out.println("Insira seu cargo: ");
        cargo = scan.nextLine();
        System.out.println("Insira seu salário bruto: ");
        salarioBruto = scan.nextDouble();
        System.out.println("Insira seu código de funcionário: ");
        codigoFunc = scan.nextInt();

    }
    public String mostrarDados(){
        return("\nNome: "+ this.nome+"\nCargo: "+ this.cargo +"\nSalario R$ "+this.salarioBruto);
    }
    public double calculaSalarioLiquido(double INSS){
        return (this.salarioBruto-(this.salarioBruto*INSS));
    }
}