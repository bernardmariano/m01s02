package exercicios;

public class Exercicio3 {

    public static void main(String[] args) {
        int[] extrato = { 100, -35, -15, -5, 55, -20 };

//        a) Percorra o array (operador 'for') e imprima cada elemento do array na ordem;
        for(int i=0; i < extrato.length; i++) {
            System.out.println( extrato[i] );
        }

        System.out.println();
//        b) Percorra o array (operador 'for') e imprima os elementos de trás pra frente (do último para o primeiro);
        for (int i=extrato.length-1; i >= 0; i--) {
//            System.out.println( extrato[i] );
        }

        System.out.println();
//        c) Percorra o array (operador 'for') e calcule o saldo final da conta (valor inicial era zero);
        int saldo = 0;
        for(int i=0; i < extrato.length; i++) {
            saldo += extrato[i];
        }
        System.out.println(saldo);

        System.out.println();
//        d) Imprima no console a mensagem 'saldo positivo' ou 'saldo negativo', dependendo do resultado do saldo final calculado.
        if (saldo > 0) {
            System.out.println("Saldo positivo");
        } else {
            System.out.println("Saldo negativo");
        }

    }


}
