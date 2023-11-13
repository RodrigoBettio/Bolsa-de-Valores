package Salvar;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import Principal.Investidor;

public class SalvarTexto {
    public static void lerDadosDoArquivo(String nomeArquivo) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha); 
            }
        }
    }

    public static void salvarTransacao(String nomeArquivo, String informacoesTransacao) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo, true))) {
            writer.write(informacoesTransacao);
            writer.newLine();  
        }
    }
    String carteira = investidor.obterCarteiraComoString();

    String nomeArquivo = "carteira.txt";

    try {
        // Chame o método para salvar a carteira no arquivo
        SalvarTexto.salvarCarteiraEmArquivo(nomeArquivo, carteira);
        System.out.println("Carteira salva com sucesso em " + nomeArquivo);
    } catch (IOException e) {
        System.err.println("Erro ao salvar a carteira: " + e.getMessage());
    }

}

