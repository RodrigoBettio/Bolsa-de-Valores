import java.util.LinkedList;
import java.util.List;

public class Carteira {
    private String nomeCarteira;
    private List<Acao> ativos = new LinkedList<>();

    public Carteira(String nomeCarteira) {
        this.nomeCarteira = nomeCarteira;
    }

    public String getNomeCarteira() {
        return nomeCarteira;
    }

    public List<Acao> getAtivos() {
        return ativos;
    }

    public void adicionarAtivo(Acao acao) {
        ativos.add(acao);
    }

    public void removerAtivo(Acao acao) {
        ativos.remove(acao);
    }

    public int quantidadeAtivos(Acao acao) {
        int quantidade = 0;
        for (Acao ativo : ativos) {
            if (ativo.equals(acao)) {
                quantidade++;
            }
        }
        return quantidade;
    }
}
