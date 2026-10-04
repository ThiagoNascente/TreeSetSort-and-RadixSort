import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class TreeSetSort<T> {
    public List<T> sort(List<T> entrada){
        List<T> retorno = new LinkedList<>();
        TreeSet<T> tree = new TreeSet<>();
        for(T i : entrada){
            tree.add(i);
        }
        for(T i : tree){
            retorno.add(i);
        }

        return retorno;
    }

    public static void main(String[] args){
        TreeSetSort<Double> op = new TreeSetSort<>();
        List<Double> lista = new LinkedList<>(List.of(5.4,4.0,87.9,45.7,14.7,15.9,1.9,2.5));
        System.out.println(lista);
        lista = op.sort(lista);
        System.out.println(lista);
    }

    // Um ordenador tipado usando uma técnica de preencher uma TreeSetSort
    // A ordenação acontece devido a estrutura ser balanceada

}
