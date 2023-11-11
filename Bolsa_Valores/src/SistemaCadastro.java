import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SistemaCadastro {
    private static Queue<Investidor> filaInvestidores = new LinkedList<>();

    public static void adicionarInvestidor(Investidor investidor) {
        filaInvestidores.offer(investidor);
    }

    public static Investidor obterProximoInvestidor() {
        return filaInvestidores.poll();
    }

    public static void exibirInvestidores() {
        System.out.println("Lista de investidores:");
        for (Investidor investidor : filaInvestidores) {
            System.out.println("Nome: " + investidor.getNome());
            System.out.println("CPF: " + investidor.getCpf());
            System.out.println("Carteira: " + investidor.getNomeCarteira());
            System.out.println("Dinheiro: " + investidor.getDinheiro());
            System.out.println();
        }
    }
    

    }
    

