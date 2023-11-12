import java.util.LinkedList;
import java.util.Queue;
import java.util.Map.Entry;

public class SistemaCadastro {
    private static Queue<Investidor> filaInvestidores = new LinkedList<>();

    public static void adicionarInvestidor(Investidor investidor) {
        filaInvestidores.offer(investidor);
    }

    public static Investidor obterProximoInvestidor() {
        return filaInvestidores.poll();
    }

    public static void exibirInvestidores() {
        System.out.println("Lista de Investidores:");
        for (Investidor investidor : filaInvestidores) {
            System.out.println("Nome: " + investidor.getNome());
            System.out.println("CPF: " + investidor.getCpf());
            System.out.println("Carteiras:");
            for (Entry<String, Carteira> entry : investidor.getCarteiras().entrySet()) {
                Carteira carteira = entry.getValue();
                System.out.println("- Nome da Carteira: " + carteira.getNomeCarteira());
            }
            System.out.println("Dinheiro Disponível: " + investidor.getDinheiro());
            System.out.println();
        }
    }
}
