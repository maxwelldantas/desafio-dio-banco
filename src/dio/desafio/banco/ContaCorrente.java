package dio.desafio.banco;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato da dio.desafio.banco.Conta Corrente === ");
        super.imprimirInfosComuns();
    }

}
