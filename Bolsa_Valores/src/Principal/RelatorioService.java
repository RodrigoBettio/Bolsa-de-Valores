package Principal;
import java.util.Comparator;
import java.util.List;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class RelatorioService {
    public static List<Ativo> composicaoCarteiraInvestidor(Investidor investidor) {
        List<Ativo> composicao = new LinkedList<>();
        for (String carteiraNome : investidor.getCarteiras().keySet()) {
            Carteira carteira = investidor.getCarteiras().get(carteiraNome);
            composicao.addAll(carteira.getAtivos());
        }
        return composicao;
    }

    public static List<Corretora> corretorasComMaisOrdens(List<Corretora> corretoras) {
        return corretoras.stream()
                .sorted(Comparator.comparingInt(c -> -c.getFilaOrdens().size()))
                .collect(Collectors.toList());
    }

    public static List<Ativo> acoesMaisNegociadas(List<Ativo> ativos) {
        return ativos.stream()
                .filter(ativo -> ativo instanceof Acao)
                .sorted(Comparator.comparingDouble(Ativo::getVolumeNegociado).reversed())
                .collect(Collectors.toList());
    }
}
