package repeticao;

import java.util.ArrayList;
import java.util.List;

public class DesafioRepeticao04 {

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 4, 7, 6, 5, 2, 3, 4, 2, 3, 1, 0, 6};
        List<Integer> unicos = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            boolean repetido = false;
            int nro = arr[i];

            for(int j = 0; j < arr.length; j++) {
                if (j == i) {  // se mesmo indice, quer dizer que é o mesmo nro, entao pode pular
                    continue;
                }
                if (nro == arr[j]) { // quer dize que eh repetido
                    repetido = true;
                }
            }

            if (!repetido) {
                unicos.add(nro);
            }
        }

        System.out.println( unicos );

//        int[] arr = {3, 5, 1, 4, 7, 6, 5, 2, 3, 4, 2, 3, 1, 0, 6};
//        List<Integer> semRep = new ArrayList<>();
//
//        for (int i=0; i<arr.length ;i++){
//            if (!semRep.contains(arr[i])){
//                semRep.add(arr[i]);
//            }
//        }
//        System.out.println("A lista sem repetições é "+semRep);
    }

}