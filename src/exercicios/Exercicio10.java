package exercicios;

public class Exercicio10 {

    public static void main(String[] args) {

        String palavra = "radar";

        int tamanho = palavra.length();  // retorna como tamanho a quantidade de letras da String
        int metade = tamanho / 2;

        boolean resultado = true;

        for (int i=0; i < metade; i++) {
            if (palavra.charAt(i) != palavra.charAt((tamanho - 1) - i) ) {
                resultado = false;
                break;
            }
        }

        System.out.println(resultado);

//        String nome = "thiago";
//        String nomeInvertido = new StringBuilder(nome).reverse().toString();
//        System.out.println(nome.equals(nomeInvertido));

    }

}