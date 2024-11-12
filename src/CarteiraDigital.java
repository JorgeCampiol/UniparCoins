import java.util.ArrayList;
import java.util.List;

public class CarteiraDigital {
    private double saldo;
    private List<String> historicoTransacoes; // Lista para armazenar histórico de transações

    // Construtor inicializando saldo e histórico de transações
    public CarteiraDigital() {
        this.saldo = 0.0;
        this.historicoTransacoes = new ArrayList<>();
    }

    //  adicionar saldo à carteira
    public void adicionarSaldo(double valor) {
        if (valor > 0) {
            saldo += valor;
            historicoTransacoes.add("Adicionado: R$" + valor);
            System.out.println("Saldo adicionado com sucesso!");
        } else {
            System.out.println("Valor inválido para adição de saldo.");
        }
    }

    //  realizar um pagamento
    public void realizarPagamento(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            historicoTransacoes.add("Pagamento: R$" + valor);
            System.out.println("Pagamento realizado com sucesso!");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para realizar o pagamento.");
        } else {
            System.out.println("Valor inválido para pagamento.");
        }
    }

    // verificar o saldo atual
    public double verificarSaldo() {
        return saldo;
    }

    // exibir o histórico de transações
    public void exibirHistoricoTransacoes() {
        System.out.println("Histórico de Transações:");
        for (String transacao : historicoTransacoes) {
            System.out.println(transacao);
        }
    }
}
