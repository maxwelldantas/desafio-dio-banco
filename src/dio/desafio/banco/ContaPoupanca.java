package dio.desafio.banco;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato da dio.desafio.banco.Conta Poupança === ");
        super.imprimirInfosComuns();
    }
}
