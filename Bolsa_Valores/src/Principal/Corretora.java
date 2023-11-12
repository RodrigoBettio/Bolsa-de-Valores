package Principal;
import java.util.LinkedList;
import java.util.Queue;

public class Corretora {
    private String nome;
    private double corretagem; 

    private Queue<Ordem> filaOrdens = new LinkedList<>();

    public Corretora(String nome, double corretagem) {
        this.nome = nome;
        this.corretagem = corretagem;
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

    public void setCorretagem(float corretagem) {
        this.corretagem = corretagem;
    }
}