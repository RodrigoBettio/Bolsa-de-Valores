package Principal;

import java.util.ArrayList;
import java.util.List;

class FII extends Ativo {
    private double valor;
    private double dividendos;
    private static List<FII> fiisDisponiveis = new ArrayList<>();

    public FII(String codigo, String nome, double valor, double dividendos) {
        super(codigo, nome);
        this.valor = valor;
        this.dividendos = dividendos;
        fiisDisponiveis.add(this);
    }

    public double getValor() {
        return valor;
    }

    public double getDividendos() {
        return dividendos;
    }

    public static List<FII> getFiisDisponiveis() {
        return fiisDisponiveis;
    }
    
    public static void exibirTodosOsFIIs() {
        System.out.println("Lista de FIIs disponíveis:");
        for (FII fii : fiisDisponiveis) {
            System.out.println("Código: " + fii.getCodigo());
            System.out.println("Nome: " + fii.getNome());
            System.out.println("Valor: " + fii.getValor());
            System.out.println("Dividendos Mensais: " + fii.getDividendos());
            System.out.println();
        }
    }
    
}
