import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DesafiosAula1 {

    public static void main(String[] args) {

        // DESAFIO 01
        String[] cores = {"vermelho", "preto", "branco", "roxo", "azul", "amarelo"};
        System.out.println("Tamanho: " + cores.length);
        System.out.println("Terceiro Elemento: " + cores[2]);
        System.out.println("Primeiro Elemento: " + cores[0]);
        System.out.println("Ultimo Elemento: " + cores[5]);
        System.out.println("Ultimo Elemento: " + cores[cores.length-1]);

        // DESAFIO 02
        String[][] multicores = {
                {"vermelho", "preto", "branco"},
                {"roxo", "azul"}
        };
        System.out.println("Primeiro elemento do primeiro array: " + multicores[0][0]);
        System.out.println("Primeiro elemento do segundo array: " + multicores[1][0]);
        System.out.println("Tamanho array multidimensional: " + multicores.length);
        System.out.println("Tamanho primeiro array: " + multicores[0].length);

        // DESAFIO 03
        /* Com base no que vimos sobre arrays, crie uma array de tamanho 5 e tipo “int”.
        Em seguida, adicione os números de 1 a 5 em ordem sequencial.
        */
        int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;
//      ou  int[] numeros = {1,2,3,4,5};

        // DESAFIO 04
        /* Agora crie uma lista vazia de números (Integer).
        Adicione números começando do número 5 e indo até o número 10 (6 itens).
        */
        List<Integer> lista2 = Arrays.asList(5,6,7,8,9,10);
        List<Integer> lista3 = List.of(5,6,7,8,9,10);

        List<Integer> lista = new ArrayList<>();
        lista.set(0, 5);  // indice zero, valor 5
        lista.set(1, 6);
        lista.set(2, 7);
        lista.set(3, 8);
        lista.set(4, 9);
        lista.set(5, 10);

        lista.get(3); // get = obtem valor 8, neste caso
    }

}