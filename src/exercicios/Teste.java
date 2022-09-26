package exercicios;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase: ");
        String palavra = scanner.nextLine();
        palavra.toUpperCase();
        System.out.println();

        boolean resultado = true;

        for ( int i=0; i < (palavra.length()/2) ; i++){
            if (palavra.charAt(i) != palavra.charAt((palavra.length()-1)-i)){
                resultado = false;
                break;
            }
        }

        System.out.println(resultado);
    }

}