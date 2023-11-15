package Principal;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Corretora {
    private String nome;
    private double corretagem;
    private static List<Corretora> corretorasDisponiveis = new ArrayList<>();

    private Queue<Ordem> filaOrdens = new LinkedList<>();

    public Corretora(String nome, double corretagem) {
        this.nome = nome;
        this.corretagem = corretagem;
        corretorasDisponiveis.add(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Queue<Ordem> getFilaOrdens() {
        return filaOrdens;
    }

    public void adicionarOrdem(Ordem ordem) {
        filaOrdens.add(ordem);
    }

    public Ordem processarOrdem() {
        return filaOrdens.poll();
    }

    public double getCorretagem() {
        return corretagem;
    }

    public void setCorretagem(double corretagem) {
        this.corretagem = corretagem;
    }

    public static List<Corretora> getCorretorasDisponiveis() {
        return corretorasDisponiveis;
    }

    public static void exibirCorretoras() {
        DecimalFormat df = new DecimalFormat("#.##%"); // Formato para duas casas decimais e símbolo de porcentagem

        System.out.println("Lista de Corretoras Disponíveis:");
        for (Corretora corretora : corretorasDisponiveis) {
            System.out.println("Nome: " + corretora.getNome());
            System.out.println("Taxa de Corretagem: " + df.format(corretora.getCorretagem())); 
            System.out.println();
        }
    }

    public static Corretora encontrarCorretoraPorNome(String nomeCorretora) {
        for (Corretora corretora : corretorasDisponiveis) {
            if (corretora.getNome().equalsIgnoreCase(nomeCorretora)) {
                return corretora;
            }
        }
        return null; // Retorna null se a corretora não for encontrada
    }
    
}
