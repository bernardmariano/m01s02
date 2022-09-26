package repeticao;

public class DesafioRepeticao02 {

    public static void main(String[] args) {
        double valor = 1200;
        int anos = 0;

        while (valor < 5000) {
            anos++;
            double perc = valor * 0.10;  // calculado 10%
            valor += perc;   // somei os 10% no valor original
        }

        System.out.println("Qtd de anos = " + anos);
    }

}