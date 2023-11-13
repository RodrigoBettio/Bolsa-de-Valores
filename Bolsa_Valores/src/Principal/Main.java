package Principal;
import java.util.Map;
import java.util.Scanner;
import Salvar.SalvarTexto;
public class Main {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
        
                System.out.println("Bem-vindo ao sistema de cadastro de usuários.");
                System.out.print("Digite o seu nome: ");
                String nome = scanner.nextLine();
        
                System.out.print("Digite o seu CPF: ");
                String cpf = scanner.nextLine();

                Investidor investidor = new Investidor(nome, cpf);
                SistemaCadastro.adicionarInvestidor(investidor);
                System.out.println("Cadastro concluído com sucesso!");


                
        Investidor investidor1 = new Investidor("Rodrigo Bettio", "32569802102");
        SistemaCadastro.adicionarInvestidor(investidor1);
        Investidor investidor2 = new Investidor("Pedro Mafra", "84695478211");
        SistemaCadastro.adicionarInvestidor(investidor2);
        Investidor investidor3 = new Investidor("Rony Rústico", "32456984599");
        SistemaCadastro.adicionarInvestidor(investidor3);
        Investidor investidor4 = new Investidor("Lucas Almeida", "40321450122");
        SistemaCadastro.adicionarInvestidor(investidor4);
        Investidor investidor5 = new Investidor("Milhomenos", "98563201401");
        SistemaCadastro.adicionarInvestidor(investidor5);
        Investidor investidor6 = new Investidor("Rafael Munõz", "21034521466");
        SistemaCadastro.adicionarInvestidor(investidor6);
        Investidor investidor7 = new Investidor("KillerFrost", "0324687522");
        SistemaCadastro.adicionarInvestidor(investidor7);

        //SistemaCadastro.exibirInvestidores();
          

        FII fii1 = new FII("KNCR11", "Kinea Rendimentos Imobiliários",101.15, 10.1 );
        FII fii2 = new FII("KNIP11", "Kinea Índice de Preços",90.85,9.1 );
        FII fii3 = new FII("HGLG11", "CSHG Logística", 155.64, 15.2) ;
        FII fii4 = new FII("BRCR11", "BTG Pactual Corporate Office", 54.34, 5.20);
        FII fii5 = new FII("KNRI11", "Kinea Renda Imobiliária", 158.62,15.2);
        FII fii6 = new FII("IRDM11", "Iridium Recebíveis Imobiliários", 74.76,6.8);
        FII fii7 = new FII("XPLG11", "XP Logística", 102.0, 8.2);
        FII fii8 = new FII("MXRF11", "Maxi Renda", 12.4, 0.8);
        FII fii9 = new FII("XPML11", "XP Malls", 108.5, 10.2);
        FII fii10 = new FII("HCTR11", "Hectare CE", 84.10, 6.86);

        //FII.exibirTodosOsFIIs();

        Acao acao1 = new Acao("RRRP3", "3R Petroleum", 25.57, 2.3);
        Acao acao2 = new Acao("ALSO3", "Aliansce Sonae", 38.44, 1.7);
        Acao acao3 = new Acao("ALPA4", "Alpargatas", 36.15, 0.8);
        Acao acao4 = new Acao("ABEV3", "Ambev", 18.61, 2.9);
        Acao acao5 = new Acao("ASAI3", "Assaí", 76.28, 0.4);
        Acao acao6 = new Acao("AZUL4", "Azul", 32.75, 1.2);
        Acao acao7 = new Acao("B3SA3", "B3", 22.09, 2.6);
        Acao acao8 = new Acao("BBSE3", "BB Seguridade", 27.88, 1.5);
        Acao acao9 = new Acao("BBDC3", "Bradesco", 29.14, 0.9);
        Acao acao10 = new Acao("BBDC4", "Bradesco", 28.21, 1.8);
        Acao acao11 = new Acao("BRAP4", "Bradespar", 50.61, 0.3);
        Acao acao12 = new Acao("BBAS3", "Banco do Brasil", 40.11, 1.6);
        Acao acao13 = new Acao("BRKM5", "Braskem", 51.78, 2.3);
        Acao acao14 = new Acao("BRFS3", "BRF", 18.72, 0.6);
        Acao acao15 = new Acao("BPAC11", "BTG Pactual", 77.43, 2.7);
        Acao acao16 = new Acao("CRFB3", "Carrefour", 26.86, 1.1);
        Acao acao17 = new Acao("CCRO3", "CCR", 13.92, 0.7);
        Acao acao18 = new Acao("CMIG4", "Cemig", 10.17, 2.8);
        Acao acao19 = new Acao("CIEL3", "Cielo", 5.55, 0.9);
        Acao acao20 = new Acao("COGN3", "Cogna", 4.46, 2.3);
        Acao acao21 = new Acao("CPLE6", "Copel", 6.93, 1.6);
        Acao acao22 = new Acao("CSAN3", "Cosan", 19.75, 0.8);
        Acao acao23 = new Acao("CPFE3", "CPFL Energia", 24.83, 2.1);
        Acao acao24 = new Acao("CMIN3", "CSN Mineração", 12.36, 1.5);
        Acao acao25 = new Acao("CVCB3", "CVC", 20.07, 0.2);
        Acao acao26 = new Acao("CYRE3", "Cyrela", 24.33, 2.7);
        Acao acao27 = new Acao("DXCO3", "Dexco", 10.82, 1.3);
        Acao acao28 = new Acao("ELET3", "Eletrobras", 41.17, 0.8);
        Acao acao29 = new Acao("ELET6", "Eletrobras", 43.02, 2.9);
        Acao acao30 = new Acao("EMBR3", "Embraer", 14.65, 1.1);
        Acao acao31 = new Acao("ENBR3", "Energias do Brasil", 18.37, 0.3);
        Acao acao32 = new Acao("ENGI11", "Energisa", 52.68, 1.4);
        Acao acao33 = new Acao("ENEV3", "Eneva", 8.72, 2.5);
        Acao acao34 = new Acao("EGIE3", "Engie", 37.59, 1.2);
        Acao acao35 = new Acao("EQTL3", "Equatorial", 24.15, 2.1);
        Acao acao36 = new Acao("EZTC3", "Eztec", 44.39, 0.5);
        Acao acao37 = new Acao("FLRY3", "Fleury", 26.84, 1.8);
        Acao acao38 = new Acao("GGBR4", "Gerdau", 34.82, 0.3);
        Acao acao39 = new Acao("GOAU4", "Metalúrgica Gerdau", 13.96, 2.5);
        Acao acao40 = new Acao("GOLL4", "Gol", 6.61, 0.8);
        Acao acao41 = new Acao("NTCO3", "Natura & Co.", 34.25, 2.1);
        Acao acao42 = new Acao("SOMA3", "Grupo Soma", 12.18, 0.5);
        Acao acao43 = new Acao("HAPV3", "Hapvida", 16.74, 2.3);
        Acao acao44 = new Acao("HYPE3", "Hypera", 32.57, 0.9);
        Acao acao45 = new Acao("IGTI11", "Iguatemi", 38.72, 1.7);
        Acao acao46 = new Acao("IRBR3", "IRB Brasil", 7.35, 0.3);
        Acao acao47 = new Acao("ITSA4", "Itaúsa", 9.98, 2.2);
        Acao acao48 = new Acao("ITUB4", "Itaú", 28.71, 1.1);
        Acao acao49 = new Acao("JBSS3", "JBS", 32.91, 0.7);
        Acao acao50 = new Acao("KLBN11", "Klabin", 32.84, 2.3);
        Acao acao51 = new Acao("RENT3", "Localiza", 53.44, 2.7);
        Acao acao52 = new Acao("LWSA3", "Locaweb", 35.19, 1.5);
        Acao acao53 = new Acao("LREN3", "Lojas Renner", 51.98, 0.9);
        Acao acao54 = new Acao("MGLU3", "Magazine Luiza", 18.76, 2.3);
        Acao acao55 = new Acao("MRFG3", "Marfrig", 20.65, 0.6);
        Acao acao56 = new Acao("CASH3", "Méliuz", 22.57, 1.7);
        Acao acao57 = new Acao("BEEF3", "Minerva", 8.84, 2.4);
        Acao acao58 = new Acao("MRVE3", "MRV", 23.45, 1.1);
        Acao acao59 = new Acao("MULT3", "Multiplan", 25.63, 0.4);
        Acao acao60 = new Acao("PCAR3", "Pão de Açúcar", 19.73, 2.8);
        Acao acao61 = new Acao("PETR3", "Petrobras", 29.12, 0.7);
        Acao acao62 = new Acao("PETR4", "Petrobras", 28.27, 1.4);
        Acao acao63 = new Acao("PRIO3", "Prio (antiga PetroRio)", 45.62, 0.8);
        Acao acao64 = new Acao("PETZ3", "Petz", 26.13, 2.1);
        Acao acao65 = new Acao("RADL3", "RaiaDrogasil", 24.98, 1.3);
        Acao acao66 = new Acao("RAIZ4", "Raízen", 50.07, 0.7);
        Acao acao67 = new Acao("RDOR3", "Rede Dor", 15.49, 2.6);
        Acao acao68 = new Acao("RAIL3", "Rumo", 17.21, 1.5);
        Acao acao69 = new Acao("SBSP3", "Sabesp", 45.28, 0.9);
        Acao acao70 = new Acao("SANB11", "Santander", 29.35, 2.3);
        Acao acao71 = new Acao("SMTO3", "São Martinho", 35.17, 0.6);
        Acao acao72 = new Acao("CSNA3", "CSN", 39.44, 2.5);
        Acao acao73 = new Acao("SLCE3", "SLC Agrícola", 14.98, 0.8);
        Acao acao74 = new Acao("SUZB3", "Suzano", 47.12, 1.7);
        Acao acao75 = new Acao("TAEE11", "Taesa", 32.09, 0.3);
        Acao acao76 = new Acao("VIVT3", "Telefônica Brasil", 44.88, 2.2);
        Acao acao77 = new Acao("TIMS3", "Tim", 15.57, 1.1);
        Acao acao78 = new Acao("TOTS3", "Totvs", 22.34, 0.5);
        Acao acao79 = new Acao("UGPA3", "Ultrapar", 19.67, 2.7);
        Acao acao80 = new Acao("USIM5", "Usiminas", 17.26, 0.6);
        Acao acao81 = new Acao("VALE3", "Vale", 98.13, 2.4);
        Acao acao82 = new Acao("BHIA3", "Grupo Casas Bahia", 32.47, 0.9);
        Acao acao83 = new Acao("VBBR3", "Vibra Energia", 42.39, 2.1);
        Acao acao84 = new Acao("WEGE3", "Weg", 45.68, 0.4);
        Acao acao85 = new Acao("YDUQ3", "Yduqs", 10, 2.8);

        //Acao.exibirAcoes();

        Corretora corretora1 = new Corretora("Rico", 0.0f);
        Corretora corretora2 = new Corretora("Clear", 0.01f);
        Corretora corretora3 = new Corretora("Toro", 0.015f);
        Corretora corretora4 = new Corretora("C6 Bank", 0.02f);
        Corretora corretora5= new Corretora("XP Investimentos", 0.018f);
        //Corretora.exibirCorretoras();

// Parte Prática

System.out.println("\nDados do investidor:");
System.out.println("Nome: " + investidor.getNome());
System.out.println("CPF: " + investidor.getCpf());
System.out.println("Dinheiro: " + investidor.getDinheiro());




Corretora corretoraEscolhida = null;

while (corretoraEscolhida == null) {
    System.out.println("Opção para escolher a corretora selecionada.");
    Corretora.exibirCorretoras();
    System.out.print("Escolha uma Corretora para intermediar os negócios (Utilize o nome): ");
    String nomeCorretora = scanner.nextLine();
    corretoraEscolhida = Corretora.encontrarCorretoraPorNome(nomeCorretora);

    if (corretoraEscolhida == null) {
        System.out.println("Corretora não encontrada. Escolha novamente.");
    }
}

investidor.setCorretora(corretoraEscolhida);
System.out.println("Corretora escolhida: " + corretoraEscolhida.getNome());



boolean sair = false;
while (!sair) {    //Menu Usuário
    System.out.println("\nOpções:");
    System.out.println("1. Comprar");
    System.out.println("2. Vender");
    System.out.println("3. Mostrar minha Carteira");
    System.out.println("4. Mostrar Dados de um Investidor");
    System.out.println("5. Trocar de Corretora");
    System.out.println("6. Sair");
    System.out.print("Escolha uma opção (1/2/3/4/5/6): ");
    int escolha = scanner.nextInt();
    scanner.nextLine();  // Para consumir a quebra de linha

    Investidor investidorEscolhido = null;
    switch (escolha) { 
       
            case 1: //Comprar
        System.out.println("\nOpção Comprar selecionada.");
        
        boolean escolhaValida = false;
        
        while (!escolhaValida) {
            System.out.println("\nEscolha o que deseja comprar:");
            System.out.println("1. Comprar FIIs");
            System.out.println("2. Comprar Ações");
            System.out.println("3. Voltar ao menu principal");
            int escolhaCompra = scanner.nextInt();
            scanner.nextLine(); // Consuma a quebra de linha
    
            switch (escolhaCompra) {
                case 1:// Comprar FIIs
                    
                    FII.exibirTodosOsFIIs(); // Mostre os FIIs disponíveis
                    System.out.print("Escolha o FII que deseja comprar (código): ");
                    String codigoFII = scanner.nextLine();
                    System.out.print("Digite a quantidade que deseja comprar: ");
                    int quantidadeCompra = scanner.nextInt();
                    scanner.nextLine(); // Consuma a quebra de linha

                    FII fiiEscolhido = FII.encontrarFII(codigoFII);
                    if (fiiEscolhido != null) {
                        investidor.comprarFII(fiiEscolhido, quantidadeCompra, "Carteira");
                        System.out.println(quantidadeCompra + " cotas de " + fiiEscolhido.getNome() + " compradas com sucesso!");
                    } else {
                        System.out.println("FII não encontrado.");
                    }
                    break;

                case 2:// Comprar Ações
                    
                    Acao.exibirAcoes(); // Mostre as Ações disponíveis
                    System.out.print("Escolha a Ação que deseja comprar (código): ");
                    String codigoAcao = scanner.nextLine();
                    System.out.print("Digite a quantidade que deseja comprar: ");
                    quantidadeCompra = scanner.nextInt();
                    scanner.nextLine(); // Consuma a quebra de linha

                    Acao acaoEscolhida = Acao.encontrarAcao(codigoAcao);
                    if (acaoEscolhida != null) {
                        investidor.comprarAcao(acaoEscolhida, quantidadeCompra, "Carteira");
                        System.out.println(quantidadeCompra + " ações de " + acaoEscolhida.getNome() + " compradas com sucesso!");
                    } else {
                        System.out.println("Ação não encontrada.");
                    }
                    break;

                case 3:// Opção para voltar ao menu principal
                    
                    System.out.println("Retornando ao menu principal.");
                    escolhaValida = true;
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        break;
    
            case 2: //Vender
        System.out.println("Opção Vender selecionada.");
        
        boolean escolhaValidaVenda = false;
        
        while (!escolhaValidaVenda) {
            System.out.println("\nEscolha o que deseja vender:");
            System.out.println("1. Vender FIIs");
            System.out.println("2. Vender Ações");
            System.out.println("3. Mostrar seus Ativos");
            System.out.println("4. Voltar ao menu principal");
            int escolhaVenda = scanner.nextInt();
            scanner.nextLine(); // Consuma a quebra de linha
    
            switch (escolhaVenda) {
                case 1: // Vender FIIs
                FII.exibirTodosOsFIIs();// Mostre os FIIs disponíveis
                System.out.print("Escolha o FII que deseja vender (código): ");
                String codigoFII = scanner.nextLine();
                System.out.print("Digite a quantidade que deseja vender: ");
                int quantidadeVendaFII = scanner.nextInt();
                scanner.nextLine(); 
            
                FII fiiEscolhido = FII.encontrarFII(codigoFII);
            
                if (fiiEscolhido != null) {
                    boolean vendaBemSucedida = investidor.venderFII(fiiEscolhido, quantidadeVendaFII, "Carteira");
                    if (vendaBemSucedida) {
                        System.out.println(quantidadeVendaFII + " cotas de " + fiiEscolhido.getNome() + " vendidas com sucesso!");
                    } else {
                        System.out.println("Erro ao vender FIIs.");
                    }
                } else {
                    System.out.println("FII não encontrado.");
                }
                break;
            
    
                case 2: // Vender Ações

                    Acao.exibirAcoes(); // Mostre as Ações disponíveis
                    System.out.print("Escolha a Ação que deseja vender (código): ");
                    String codigoAcao = scanner.nextLine();
                    System.out.print("Digite a quantidade que deseja vender: ");
                    int quantidadeVendaAcao = scanner.nextInt();
                    scanner.nextLine();
                
                    Acao acaoEscolhida = Acao.encontrarAcao(codigoAcao);
                
                    if (acaoEscolhida != null) {
                        boolean vendaBemSucedida = investidor.venderAcao(acaoEscolhida, quantidadeVendaAcao, "Carteira");
                        if (vendaBemSucedida) {
                            System.out.println(quantidadeVendaAcao + " ações de " + acaoEscolhida.getNome() + " vendidas com sucesso!");
                        } else {
                            System.out.println("Erro ao vender ações.");
                        }
                    } else {
                        System.out.println("Ação não encontrada.");
                    }
                    break;
                 
                case 3: //Mostrar a Carteira
                investidor.exibirCarteira();
                break;
                case 4: // Opção para voltar ao menu principal
                    
                    System.out.println("Retornando ao menu principal.");
                    escolhaValidaVenda = true;
                    break;
    
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        break;
    

            case 3: //Mostrar Carteira
            investidor.exibirCarteira();
            break;
        
            case 4: //Mostrar Dados

            
           
            System.out.println("Opção Mostrar dados de um investidor selecionada.");
            System.out.print("Digite o CPF do investidor que deseja visualizar: ");
            String cpfInvestidor = scanner.nextLine();
            investidorEscolhido = SistemaCadastro.encontrarInvestidorPorCPF(cpfInvestidor); 
            if (investidorEscolhido != null) {
                System.out.println("Dados do investidor:");
                System.out.println("Nome: " + investidorEscolhido.getNome());
                System.out.println("CPF: " + investidorEscolhido.getCpf());
                System.out.println("Saldo: " + investidorEscolhido.getDinheiro());
                System.out.println("Corretora Utilizada"+ corretoraEscolhida);
            } else {
                System.out.println("Investidor não encontrado.");
            }
            break;
 
            case 5: //Trocar de Corretora
    System.out.println("Opção para trocar de corretora selecionada.");
    Corretora.exibirCorretoras();
    System.out.print("Escolha sua nova Corretora (Utilize o nome)");
    String nomeCorretora = scanner.nextLine();
    Corretora novaCorretora = Corretora.encontrarCorretoraPorNome(nomeCorretora);
    if (novaCorretora != null) {
        investidor.setCorretora(novaCorretora);
        System.out.println("Corretora Utilizada: " + novaCorretora.getNome());
    } else {
        System.out.println("Corretora não encontrada.");
    }
    break;

            case 6: //Sair
                    // Opção para sair
                    System.out.println("Saindo do programa.");
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        System.out.println("Programa encerrado.");
        scanner.close();
    }
    
}
