package Examples.Data_Collections.Iterator;


import java.util.*;

public class IteratorMain {
    public static void main(String[] args) {
        //Java Iterator

        List<String> list =  new ArrayList<>();

        list.add("Ivan");
        list.add("Denis");
        list.add("Kate");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }

        Set<String> set = new HashSet<>();
        set.add("Jane");
        set.add("Summer");
        set.add("Autumn");

        Iterator<String> iterator2 = set.iterator();

        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        Iterator<String> keyIterator = map.keySet().iterator();
        Iterator<String> valueIterator = map.values().iterator();

        Iterator<Map.Entry<String, String>> entryIterator = map.entrySet().iterator();



    }
}