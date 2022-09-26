package arraysElistas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("tiago");
        nomes.add("marcos");
        nomes.add("tiago");
        nomes.add("fabiane");

        System.out.println(nomes);
        System.out.println("Vazia? " + nomes.isEmpty() );
        System.out.println("Tamanho: " + nomes.size());

        boolean apagou = nomes.remove("tiago");
        System.out.println(apagou);
        System.out.println(nomes);

        nomes.clear();
        System.out.println(nomes);
        System.out.println(nomes.size());

        List<Long> numerosVazio = new ArrayList<>();

        List<Long> numeros = Arrays.asList(10l, 34l, 56l, 78l);
        // numeros.remove(56l);  // nao permitido

        List<Long> copia = new ArrayList<>(numeros);

        numeros.set(2, 99l);
        System.out.println("Numeros : " + numeros);
        System.out.println("Copia : " + copia);

//        numeros.addAll(copia);

        List<Long> outrosNumeros = List.of(12l, 32l, 65l);  // java 8 - imutavel
        // outrosNumeros.remove(32l);   // nao permitido
//        outrosNumeros.set(1, 88l);
    }

}