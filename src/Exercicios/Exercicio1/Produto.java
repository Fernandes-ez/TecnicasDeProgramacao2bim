package Exercicios.Exercicio1;

public class Produto {
        // atributos
        public int codigo;
        public String nome;
        public double valor;
        //métodos
        public String mostrarDados(){
            return ("\nProduto: "+ this.nome+"\nValor: R$ "+ this.valor);
        }
        public double calcularTotal(int quantidade){
            return this.valor*quantidade;
        }
}
