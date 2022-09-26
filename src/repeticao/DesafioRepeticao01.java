package repeticao;

public class DesafioRepeticao01 {

    public static void main(String[] args) {

        int[] numeros = {5, 7, -7, -4, 3, -9, 0, 12, -34, 0, 3, 6, 9};

        int positivos = 0;
        int negativos = 0;
        int zeros = 0;

        for (int i = 0; i < numeros.length; i++) {
            int nro = numeros[i];
            if (nro > 0) {
                positivos++;
            } else if (nro < 0) {
                negativos++;
            } else {
                zeros++;
            }
        }

        System.out.println("Qtd positivos: " + positivos);
        System.out.println("Qtd negativos: " + negativos);
        System.out.println("Qtd zeros: " + zeros);
    }

}
