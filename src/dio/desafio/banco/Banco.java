package dio.desafio.banco;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Banco {

    private String nome;
    private List<Conta> contas;

    public void imprimirContas() {
        System.out.println(String.format("===== Banco: %s ====", this.nome));
        System.out.println("Tem as seguintes contas abaixo: ");
        for (Conta conta : contas) {
            conta.imprimirInfosComuns();
        }
    }


}
