abstract class Ativo {
    private String codigo;
    private String nome;
    private double volumeNegociado;
    private Stack<Ordem> historicoOrdens = new Stack<>();

    public Ativo(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getVolumeNegociado() {
        return volumeNegociado;
    }

    public void setVolumeNegociado(double volumeNegociado) {
        this.volumeNegociado = volumeNegociado;
    }

    public Stack<Ordem> getHistoricoOrdens() {
        return historicoOrdens;
    }

    public void adicionarOrdem(Ordem ordem) {
        historicoOrdens.push(ordem);
    }
}

class Acao extends Ativo {
    public Acao(String codigo, String nome) {
        super(codigo, nome);
    }
}

class FII extends Ativo {
    public FII(String codigo, String nome) {
        super(codigo, nome);
    }
}
