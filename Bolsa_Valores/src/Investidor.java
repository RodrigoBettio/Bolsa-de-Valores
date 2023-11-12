import java.util.HashMap;
import java.util.Map;

public class Investidor {
    private String nome;
    private String cpf;
    private Map<String, Carteira> carteiras = new HashMap<>();
    private double dinheiro;

    public Investidor(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.dinheiro = 1000.0;
        criarCarteira("Carteira");
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Map<String, Carteira> getCarteiras() {
        return carteiras;
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void criarCarteira(String nomeCarteira) {
        Carteira carteira = new Carteira(nomeCarteira);
        carteiras.put(nomeCarteira, carteira);
    }

    public void comprar(Corretora corretora, Acao acao, int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("A quantidade deve ser um número positivo.");
        }

        double custoTotal = quantidade * acao.getValor() * (1 + corretora.getCorretagem());

        if (dinheiro < custoTotal) {
            throw new IllegalArgumentException("Você não tem dinheiro suficiente para comprar " + quantidade + " ações de " + acao.getNome() + ".");
        }

        // Itera sobre as carteiras no mapa e faz a compra na primeira carteira encontrada
        for (Map.Entry<String, Carteira> entry : carteiras.entrySet()) {
            Carteira carteira = entry.getValue();

            dinheiro -= custoTotal;
            for (int i = 0; i < quantidade; i++) {
                carteira.adicionarAtivo(acao);
            }
            // Termina a compra após adicionar ativos a uma carteira
            break;
        }
    }

    public void vender(Corretora corretora, Acao acao, int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("A quantidade deve ser um número positivo.");
        }

        Carteira carteira = null;
        // Encontrar a carteira com a quantidade desejada do ativo
        for (Map.Entry<String, Carteira> entry : carteiras.entrySet()) {
            Carteira c = entry.getValue();
            if (c.quantidadeAtivos(acao) >= quantidade) {
                carteira = c;
                break;
            }
        }

        if (carteira == null) {
            throw new IllegalArgumentException("Você não possui a quantidade desejada desse ativo para venda.");
        }

        double receitaTotal = quantidade * acao.getValor() * (1 - corretora.getCorretagem());
        dinheiro += receitaTotal;

        for (int i = 0; i < quantidade; i++) {
            carteira.removerAtivo(acao);
        }
    }
}
