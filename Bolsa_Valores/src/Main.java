public class Main {
    public static void main(String[] args) {
        Corretora corretora = new Corretora("Corretora1", 0.1f); // Adicione a taxa de corretagem

        Investidor investidor = new Investidor("Investidor1", "123456789");

        Acao acao = new Acao("AAPL", "Apple Inc.", 15.0, 2.0); // Adicione o valor e dividendos

        investidor.comprar(corretora, acao, 10);
        System.out.println("Dinheiro após compra: " + investidor.getDinheiro());

        investidor.vender(corretora, acao, 5);
        System.out.println("Dinheiro após venda: " + investidor.getDinheiro());
    }
}