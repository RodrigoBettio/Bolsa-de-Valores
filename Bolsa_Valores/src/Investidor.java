import java.util.LinkedList;
import java.util.List;
class Investidor {
    private String nome;
    private String cpf;
    private List<Carteira> carteiras = new LinkedList<>();
    private double dinheiro;
    private String nomeCarteira;

    public Investidor(String nome, String cpf, String nomeCarteira) {
        this.nome = nome;
        this.cpf = cpf;
        this.dinheiro = 1000.0;
        this.nomeCarteira = nomeCarteira;
    
        Carteira carteira = new Carteira("Carteira de " + nome);
        carteiras.add(carteira);
    }

    public String getNomeCarteira() {
        return nomeCarteira;
    }

    public void setNomeCarteira(String nomeCarteira) {
        this.nomeCarteira = nomeCarteira;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Carteira> getCarteiras() {
        return carteiras;
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void adicionarCarteira(Carteira carteira) {
        carteiras.add(carteira);
    }

    public void comprar(Corretora corretora, Acao acao, int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("A quantidade deve ser um número positivo.");
        }

        double custoTotal = quantidade * acao.getValor() * (1 + corretora.getCorretagem());
        
        if (dinheiro < custoTotal) {
            throw new IllegalArgumentException("Você não tem dinheiro suficiente para comprar " + quantidade + " ações de " + acao.getNome() + ".");

        }

        if (carteiras.isEmpty()) {
            throw new IllegalArgumentException("Você não possui carteiras para comprar o ativo.");
        }
        dinheiro -= custoTotal;
        for (int i = 0; i < quantidade; i++) {
            carteiras.get(0).adicionarAtivo(acao);
        }


    }

    public void vender(Corretora corretora, Acao acao, int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("A quantidade deve ser um número positivo.");
        }

        Carteira carteira = null;
        for (Carteira c : carteiras) {
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
