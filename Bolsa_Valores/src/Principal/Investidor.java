package Principal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Investidor {
    private String nome;
    private String cpf;
    private Map<String, Carteira> carteiras = new HashMap<>();
    private double dinheiro;
    private Corretora corretoraEscolhida;

    Scanner scanner = new Scanner(System.in);

    public Investidor(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.dinheiro = 10000.0;
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
    
    public void setCorretora(Corretora corretora) {
        this.corretoraEscolhida = corretora;
    }
    
    public Corretora getCorretoraEscolhida() {
        return corretoraEscolhida;
    }
    
    


    public void atualizarSaldo(double valor){
        this.dinheiro += valor;
    }

    public void criarCarteira(String nomeCarteira) {
        Carteira carteira = new Carteira(nomeCarteira);
        carteiras.put(nomeCarteira, carteira);
    }

    public void comprarFII(FII fii, int quantidade, String carteiraNome) {
        double custoTotal = quantidade * fii.getValor();
        if (dinheiro < custoTotal) {
            throw new IllegalArgumentException("Saldo insuficiente para comprar " + quantidade + " cotas de " + fii.getNome() + ".");
        }
        
        Carteira carteira = carteiras.get(carteiraNome);
        if (carteira == null) {
            throw new IllegalArgumentException("Carteira não encontrada.");
        }
        atualizarSaldo(custoTotal);    
        for (int i = 0; i < quantidade; i++) {
            carteira.adicionarAtivo(fii);
        }
         atualizarSaldo(-custoTotal);
    }
    
    public void comprarAcao(Acao acao, int quantidade, String carteiraNome) {
        double custoTotal = quantidade * acao.getValor();
        if (dinheiro < custoTotal) {
            throw new IllegalArgumentException("Saldo insuficiente para comprar " + quantidade + " ações de " + acao.getNome() + ".");
        }
        
        Carteira carteira = carteiras.get(carteiraNome);
        if (carteira == null) {
            throw new IllegalArgumentException("Carteira não encontrada.");
        }
        
        for (int i = 0; i < quantidade; i++) {
            carteira.adicionarAtivo(acao);
        }

        atualizarSaldo(-custoTotal);
    }
    
    public int getQuantidadeAtivos(Ativo ativo, String carteiraNome) {
        Carteira carteira = carteiras.get(carteiraNome);
        if (carteira != null) {
            return carteira.quantidadeAtivos(ativo);
        } else {
            throw new IllegalArgumentException("Carteira não encontrada.");
        }
    }
    
    public boolean venderAcao(Acao acao, int quantidade, String carteiraNome) {
        Carteira carteira = carteiras.get(carteiraNome);
        if (carteira != null) {
            int quantidadeDisponivel = carteira.quantidadeAcaoEmCarteira(acao);
            if (quantidadeDisponivel >= quantidade) {
                for (int i = 0; i < quantidade; i++) {
                    carteira.removerAtivo(acao, quantidade);
                }
                double valorVenda = quantidade * acao.getValor();
                atualizarSaldo(valorVenda);
                return true; // Venda bem-sucedida
            }
        }
        return false; // Venda falhou
    }
    
    public boolean venderFII(FII fii, int quantidade, String carteiraNome) {
        Carteira carteira = carteiras.get(carteiraNome);
        if (carteira != null) {
            int quantidadeDisponivel = carteira.quantidadeFIIEmCarteira(fii);
            if (quantidadeDisponivel >= quantidade) {
                for (int i = 0; i < quantidade; i++) {
                    carteira.removerAtivo(fii, quantidade);
                }
                double valorVenda = quantidade * fii.getValor();
                atualizarSaldo(valorVenda);
                return true; // Venda bem-sucedida
            }
        }
        return false; // Venda falhou
    }
    
    public void exibirCarteira() {
        Map<String, Carteira> carteirasDoInvestidor = this.getCarteiras();
        
        System.out.println("Investidor: " + this.getNome() + " (" + this.getCpf() + ")");
        if (carteirasDoInvestidor.isEmpty()) {
            System.out.println("O investidor não possui nenhuma carteira.");
        } else {
            System.out.println("Escolha uma das carteiras disponíveis:");
            int carteiraIndex = 1;
            for (Map.Entry<String, Carteira> entry : carteirasDoInvestidor.entrySet()) {
                System.out.println(carteiraIndex + ". " + entry.getKey());
                carteiraIndex++;
            }
            System.out.print("Escolha o número da carteira que deseja visualizar: ");
            int escolhaCarteira = scanner.nextInt();
            scanner.nextLine();
    
            if (escolhaCarteira >= 1 && escolhaCarteira <= carteirasDoInvestidor.size()) {
                int selectedCarteiraIndex = 1;
                String selectedCarteiraNome = "";
                for (Map.Entry<String, Carteira> entry : carteirasDoInvestidor.entrySet()) {
                    if (selectedCarteiraIndex == escolhaCarteira) {
                        selectedCarteiraNome = entry.getKey();
                        break;
                    }
                    selectedCarteiraIndex++;
                }
    
                Carteira carteiraDoInvestidorEscolhido = carteirasDoInvestidor.get(selectedCarteiraNome);
                System.out.println("Carteira: " + selectedCarteiraNome);
                if (!carteiraDoInvestidorEscolhido.getAtivos().isEmpty()) {
                    for (Map.Entry<Ativo, Integer> entry : carteiraDoInvestidorEscolhido.getAtivos().entrySet()) {
                        Ativo ativo = entry.getKey();
                        int quantidade = entry.getValue();
                        System.out.println(ativo.getNome() + " (" + ativo.getCodigo() + "): " + quantidade);
                    }
                } else {
                    System.out.println("A carteira está vazia.");
                }
            } else {
                System.out.println("Número de carteira inválido.");
            }
        }
    }
    
    
    

        public double getDinheiro() {
        return dinheiro;
    }
}
