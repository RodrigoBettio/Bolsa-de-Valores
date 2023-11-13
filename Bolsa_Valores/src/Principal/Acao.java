package Principal;
import java.util.ArrayList;
import java.util.List;  

class Acao extends Ativo {
    private double valor;
    private double dividendos;
    private static List<Acao> acoesDisponiveis = new ArrayList<>();

    public Acao(String codigo, String nome, double valor, double dividendos) {
        super(codigo, nome);
        this.valor = valor;
        this.dividendos = dividendos;
        acoesDisponiveis.add(this);
    }

    public double getValor() {
        return valor;
    }

    public double getDividendos() {
        return dividendos;
    }

    public static List<Acao> getAcoesDisponiveis() {
        return acoesDisponiveis;
    }

    public static void exibirAcoes() {
        System.out.println("Lista de Ações Disponíveis:");
        for (Acao acao : acoesDisponiveis) {
            System.out.println("Código: " + acao.getCodigo());
            System.out.println("Nome: " + acao.getNome());
            System.out.println("Valor: " + acao.getValor());
            System.out.println("Dividendos Mensais: " + acao.getDividendos());
            System.out.println();
        }
    }

    public static Acao encontrarAcao(String codigo) {
        for (Acao acao : acoesDisponiveis) {
            if (acao.getCodigo().equalsIgnoreCase(codigo)) {
                return acao;
            }
        }
        return null; // Retorna null se não encontrar a ação
    }
    
}
