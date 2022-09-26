package exercicios;

public class Exercicio5 {

    public static void main(String[] args) {
        int[][] numeros = {
                {56, 65, 64, -3, 23, 42, -15, 65, 14, 32, 78, 70, 47},
                {1},
                {1, -1},
                null,
                {-2,-2,-2,-2},
                {20,10,30},
                {}
        };

        Solucao solucao = new Solucao();

        for (int i=0; i < numeros.length; i++) {
            solucao.calcular( numeros[i] );
            System.out.println();
        }
    }

}

class Solucao {

    public void calcular(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Não é possível calcular");
            return;
        }
        int min = arr[0];
        int max = arr[0];
        for(int i=0; i<arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Min:" + min);
        System.out.println("Max:" + max);
    }

}