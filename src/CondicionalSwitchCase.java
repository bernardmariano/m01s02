public class CondicionalSwitchCase {

    public static void main(String[] args) {

        String cor = "Verde";

        switch (cor) {
            case "Azul":
                System.out.println("Cor do céu!");
                break;
            case "Verde":
                System.out.println("Cor das plantas!");
                break;
            case "Dourado":
                System.out.println("Cor do ouro!");
                break;
            default:
                System.out.println("Outra cor");
        }

        if (cor == "Azul") {
            System.out.println("Cor do céu!");
        } else if (cor == "Verde") {
            System.out.println("Cor das plantas!");
        } else if (cor == "Dourado") {
            System.out.println("Cor do ouro!");
        } else {
            System.out.println("Outra cor");
        }

        System.out.println("Fora do switch case");

    }

}
