package aula29deOutubro;

import java.io.*;
import java.util.ArrayList;

public class ManipulaçãoDeArquivos {
    public static void gravar(ArrayList<String> lista, String nomeDoArquivo) throws IOException {
        FileWriter arq = new FileWriter(nomeDoArquivo);
        PrintWriter gravarArq = new PrintWriter(arq);
        for (String linha : lista) {
            gravarArq.println(linha);
        }
        gravarArq.close();
        arq.close();
    }
    public static void ler(String nomeDoArquivo, ArrayList<String> lista) throws IOException {
        FileReader arq = new FileReader(nomeDoArquivo);
        BufferedReader lerArq = new BufferedReader(arq);
        String linha = lerArq.readLine();

        while (linha!=null){
            lista.add(linha);
            linha = lerArq.readLine();
        }
        arq.close();

    }
    public static void main(String[] args) {
        ArrayList<String> bandas = new ArrayList<String>();
        bandas.add("Os Mutantes");
        bandas.add("Legião Urbana");
        bandas.add("Titãs");
        bandas.add("Paralamas do Sucesso");
        bandas.add("Barão Vermelho");
        bandas.add("Sepultura");
        bandas.add("Engenheiros do Hawaii");
        bandas.add("Skank");
        try {
            gravar(bandas, "C:\\Users\\FATEC ZONA LESTE\\Desktop\\Bandas.txt");
            System.out.println("Gravação realizada");
        } catch (IOException e) {
            System.out.println("Erro na gravação do arquivo");
        }
        ArrayList<String> arquivo = new ArrayList<>();
        try {
            ler("C:\\Users\\FATEC ZONA LESTE\\Desktop\\Bandas.txt",arquivo);
            System.out.println("Lido com sucesso!"+arquivo);
        } catch (IOException e) {
            System.out.println("Erro na leitura");
        }
    }
}
