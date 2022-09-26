public class Pratica03 {

    /*
    Dado uma variável String como uma das cores do semáforo: vermelho, amarelo e verde,
       implemente um código que imprima a frase correspondente:
        “vermelho” = “Deve parar o carro!”
        “amarelo” = “Deve finalizar travessia!”
        “verde” = “Pode passar!”;
    */

    public static void main(String[] args) {
        String cor = "verde";
        String resultado;

        switch (cor) {
            case "vermelho":
                resultado = "Deve parar o carro";
                break;
            case "amarelo":
                resultado = "Deve finalizar a travessia";
                break;
            case "verde":
                resultado = "Pode passar";
            default:
                resultado = "Semáforo quebrado";
        }

        System.out.println(resultado);
    }

}
