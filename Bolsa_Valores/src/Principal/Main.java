package Principal;
import java.util.Scanner;
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

        SistemaCadastro.exibirInvestidores();

        FII FII1 = new FII("XPML11","XP Malls");

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
        Acao acao85 = new Acao("YDUQ3", "Yduqs", 35.59, 2.8);

        Corretora corretora1 = new Corretora("Rico", 0.0f);
        Corretora corretora2 = new Corretora("Clear", 0.1f);
        Corretora corretora3 = new Corretora("Toro", 0.08f);
        Corretora corretora4 = new Corretora("C6 Bank", 0.05f);
        Corretora corretora5= new Corretora("XP Investimentos", 0.04f);

        //Parte Prática
        
        
    }
}