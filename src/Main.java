import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CarteiraDigital carteira = new CarteiraDigital();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        System.out.println("Bem-vindo à sua Carteira Digital!");

        // Loop para exibir o menu até o usuário escolher a opção de sair
        do {
            exibirMenu();
            opcao = lerEntradaUsuario(scanner);

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para adicionar ao saldo: ");
                    double valorAdicionar = scanner.nextDouble();
                    carteira.adicionarSaldo(valorAdicionar);
                    break;

                case 2:
                    System.out.print("Digite o valor do pagamento: ");
                    double valorPagamento = scanner.nextDouble();
                    carteira.realizarPagamento(valorPagamento);
                    break;

                case 3:
                    System.out.printf("Seu saldo atual é: R$%.2f%n", carteira.verificarSaldo());
                    break;

                case 4:
                    System.out.println("Obrigado por usar a sua Carteira Digital!");
                    break;

                case 5: // Opção adicional para exibir histórico
                    carteira.exibirHistoricoTransacoes();
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }

    //  exibir o menu de opções
    public static void exibirMenu() {
        System.out.println("\nEscolha uma opção:");
        System.out.println("1 - Adicionar Saldo");
        System.out.println("2 - Realizar Pagamento");
        System.out.println("3 - Verificar Saldo");
        System.out.println("4 - Sair");
        System.out.println("5 - Exibir Histórico de Transações (Opcional)");
    }

    // ler a opção escolhida pelo usuário
    public static int lerEntradaUsuario(Scanner scanner) {
        System.out.print("Usuário: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, insira um número válido.");
            System.out.print("Usuário: ");
            scanner.next(); // Limpa a entrada inválida
        }
        return scanner.nextInt();
    }
}
