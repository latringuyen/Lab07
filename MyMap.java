import java.util.HashMap;
import java.util.Map;

public class MyMap <K, V> {
    public final K k;
    public final V v;

    Map<K, V> map = new HashMap<>();

    public MyMap(K k, V v) {
        this.k = k;
        this.v = v;
    }

    public K getKey(K keyword){
        return keyword;
    }

    public V getValue(V value){
        return value;
    }

    public V get(K keyword){
        return map.get(keyword);
    }
    public void put(K keyword, V value){
        map.put(keyword, value);
    }




}
