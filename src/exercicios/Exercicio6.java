package exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercicio6 {
    public static void main(String[] args) {
//        Percorra a lista e gere uma nova com o triplo do valor de cada elemento:
        List<Integer> lista = Arrays.asList(1,2,3,4);

        List<Integer> triplos = new ArrayList<>();

        for(Integer nro : lista) {
            int resultado = nro * 3;
            triplos.add(resultado);
        }

        System.out.println(triplos);
    }
}