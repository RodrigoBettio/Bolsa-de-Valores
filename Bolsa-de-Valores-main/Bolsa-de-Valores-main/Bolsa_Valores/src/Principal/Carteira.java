package Principal;
import java.util.HashMap;
import java.util.Map;

public class Carteira {
    private String nomeCarteira;
    private Map<Ativo, Integer> ativos = new HashMap<>();

    public Carteira(String nomeCarteira) {
        this.nomeCarteira = nomeCarteira;
    }

    public String getNomeCarteira() {
        return nomeCarteira;
    }

    public Map<Ativo, Integer> getAtivos() {
        return ativos;
    }

    public void adicionarAtivo(Ativo ativo) {
        if (ativos.containsKey(ativo)) {
            int quantidade = ativos.get(ativo);
            ativos.put(ativo, quantidade + 1);
        } else {
            ativos.put(ativo, 1);
        }
    }

    public void removerAtivo(Ativo ativo, int quantidade) {
        if (ativos.containsKey(ativo)) {
            int quantidadeAtual = ativos.get(ativo); 
            if (quantidadeAtual > 1) {
                ativos.put(ativo, quantidadeAtual - 1);
            } else {
                ativos.remove(ativo);
            }
        }
    }
    

    public int quantidadeAtivos(Ativo ativo) {
        return ativos.getOrDefault(ativo, 0);
    }

    public int quantidadeFIIEmCarteira(FII fii) {
        return quantidadeAtivos(fii);
    }

    public int quantidadeAcaoEmCarteira(Acao acao) {
        return quantidadeAtivos(acao);
    }
    
}
