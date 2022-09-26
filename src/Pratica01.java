public class Pratica01 {

    // Dado uma idade, calcular se é maior de idade caso idade >= 18 anos

    public static void main(String[] args) {
        int idade = 18;
        String resultado;
        if (idade >= 18) {
            resultado = "É maior de idade";
        } else {
            resultado = "Não é maior de idade";
        }
//        String resultado = idade >= 18 ? "É maior de idade" : "Não é maior de idade";

        System.out.println(resultado);
    }

}