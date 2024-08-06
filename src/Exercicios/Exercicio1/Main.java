package Exercicios.Exercicio1;

public class Main {
    public static void main(String[] args) {
        Produto p = new Produto();
        p.nome = "Caderno";
        p.valor = 11.11;
        p.codigo = 3;
        System.out.println(p.mostrarDados()+"\nValor total: R$"+p.calcularTotal(7));

    }
}
