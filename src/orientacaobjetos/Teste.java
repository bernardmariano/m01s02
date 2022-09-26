package orientacaobjetos;

public class Teste {

    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.saldo = 1000.0;

        Cliente cliente = new Cliente();
        cliente.nome = "John";
        cliente.sobrenome = "Snow";
        cliente.cpf = 12345678901l;

        conta.titular = cliente;
    }

}

class Cliente {
    String nome;
    String sobrenome;
    Long cpf;
}

class Conta {
    Cliente titular;
    double saldo;
}
