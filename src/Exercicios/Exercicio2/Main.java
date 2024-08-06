package Exercicios.Exercicio2;
    public class Main {
        public static void main(String[] args) {
            Funcionario murilo = new Funcionario();
            murilo.inserirDados();
            System.out.println(murilo.mostrarDados()+ "\nSalário líquido: "+murilo.calculaSalarioLiquido(3));
        }
}
