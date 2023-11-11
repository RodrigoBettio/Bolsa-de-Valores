//Código feito por Lucas Milhomem, Pedro Mafra, Rafael Munõz e Rodrigo Bettio

import java.util.LinkedList;
import java.util.List;

class Carteira {
    private String numero;
    private Investidor proprietario;
    private List<Ativo> ativos = new LinkedList<>();

    public Carteira(String numero) {
        this.numero = numero;
        this.proprietario = null;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Investidor getProprietario() {
        return proprietario;
    }

    public void setProprietario(Investidor proprietario) {
        this.proprietario = proprietario;
    }

    public List<Ativo> getAtivos() {
        return ativos;
    }

    public void adicionarAtivo(Ativo ativo) {
        ativos.add(ativo);
    }

    public void removerAtivo(Ativo ativo) {
        if (ativos.contains(ativo)) {
            ativos.remove(ativo);
        } else {
            throw new IllegalArgumentException("O ativo especificado não está presente na carteira.");
        }
    }

    public int quantidadeAtivos(Ativo ativo) {
        int quantidade = 0;
        for (Ativo a : ativos) {
            if (a.getCodigo().equals(ativo.getCodigo())) {
                quantidade++;
            }
        }
        return quantidade;
    }
}