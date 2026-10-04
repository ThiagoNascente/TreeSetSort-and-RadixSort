import java.util.HashMap;
import java.util.Queue;
import java.util.List;
import java.util.Collections;
import java.util.LinkedList;

public class RadixSort {

    public void sort(List<Integer> lista) {

        HashMap<Integer, Queue<Integer>> hash = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            hash.put(i, new LinkedList<Integer>());
        }

        int max = Collections.max(lista);
        int k = 10;

        while (max >= k / 10) {

            List<Integer> temp = new LinkedList<>();

            for (Integer i : lista) {
                int digito = (i / (k / 10)) % 10;
                hash.get(digito).add(i);
            }

            for (int i = 0; i < 10; i++) {

                Queue<Integer> q = hash.get(i);

                while (!q.isEmpty()) {
                    temp.add(q.poll());
                }
            }

            lista.clear();
            lista.addAll(temp);

            k = k * 10;
        }
    }

    public static void main(String[] args) {
        RadixSort rs = new RadixSort();
        List<Integer> lista = new LinkedList<>(
            List.of(1, 5, 2, 4, 10, 64, 34, 54, 2, 35, 1098)
        );
        System.out.println(lista);
        rs.sort(lista);
        System.out.println(lista);
    }

    // Ordena somente números inteiros
    // Conseguimos ter elementos repetidos
    // Essa foi uma interpretação minha sobre RadixSort

}