import java.util.Map;
import java.util.TreeMap;

public class TreeMapUse {
     public static void main(String[] args) {
        Map<String, Integer> mp = new TreeMap<>();

        mp.put("one", 1);
        mp.put("two", 2);
        mp.put("three", 3);
        mp.put("four", 4);
        mp.put("five", 5);

      //  mp.put("two", 23);  // updates prev value for this key

        // if (!mp.containsKey("three")) {
        //     mp.put("three", 23);
        // }

        // mp.putIfAbsent("two", 26);

        System.out.println(mp);

        mp.remove("three");

        System.out.println(mp);

        System.out.println(mp.containsValue(3));

        System.out.println(mp.isEmpty());

        for (Map.Entry<String, Integer> e : mp.entrySet()) {
            System.out.println(e);

            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        for (String key : mp.keySet()) {
            System.out.println(key);
        }

        for (Integer value : mp.values()) {
            System.out.println(value);
        }
    }
}
