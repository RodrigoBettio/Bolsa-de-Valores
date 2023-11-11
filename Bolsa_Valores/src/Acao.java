class Acao extends Ativo {
    private double valor;
    private double dividendos;

    public Acao(String codigo, String nome, double valor, double dividendos) {
        super(codigo, nome);
        this.valor = valor;
        this.dividendos = dividendos;
    }

    public double getValor() {
        return valor;
    }

    public double getDividendos() {
        return dividendos;
    }
}
