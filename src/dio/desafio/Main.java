package dio.desafio;

import dio.desafio.banco.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>();

        Banco banco1 = new Banco("ADTE", contas);

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Teobaldo");
        Cliente cliente2 = new Cliente();
        cliente2.setNome("Rezende");

        Conta cc = new ContaCorrente(cliente1);
        Conta cp = new ContaPoupanca(cliente2);

        cc.depositar(100);
        cc.transferir(100, cp);

        contas.add(cc);
        contas.add(cp);

        banco1.setContas(contas);

        banco1.imprimirContas();
    }
}
