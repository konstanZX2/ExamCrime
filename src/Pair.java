import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pair <K extends Comparable<K>,V> implements Comparable<Pair<K,V>> {

    private K key;
    private V value;

    public Pair(K key, V value){
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString(){
        return "( "+key+", "+value+" )";
    }

    public static void main(String[] args) {
        Pair<String,String> pair= new Pair<>("hello","world");
        Pair<String,String> pair1= new Pair<>("bbbb","world");
        Pair<String,String>pair2= new Pair<>("aaaa","world");
        // crea otros 2 pares como esos.
        List<Pair<String,String>> list = new ArrayList<>();
        list.add(pair1);
        list.add(pair2);
        //añade otros 2 pares como esos.
        Collections.sort(list);
        System.out.println(pair);
    }

    @Override
    public int compareTo(Pair<K, V> pair) {
        return key.compareTo(pair.key);
    }
}
