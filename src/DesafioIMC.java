import java.util.Scanner;

public class DesafioIMC {

    public static void main(String[] args) {
        float altura = 1.83f;
        float peso = 74;
        float imc = peso / (altura * altura);
        System.out.println(String.format("IMC calculado = %.2f", imc));

        String resultado;

        if (imc < 18.5) {
            resultado = "magreza";
        } else if (imc < 25) {
            resultado = "normal";
        } else if (imc < 30) {
            resultado = "sobrepeso";
        } else if (imc < 40) {
            resultado = "obesidade";
        } else {
            resultado = "obesidade grave";
        }

        System.out.println("Resultado = " + resultado);
    }

}