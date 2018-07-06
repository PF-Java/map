import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Anh", 30);
        hashMap.put("Bình", 34);
        hashMap.put("Dung", 24);
        hashMap.put("Hà", 26);
        hashMap.put("Kiên", 27);
        hashMap.put("Linh", 27);

        System.out.println("Display entries in HashMap");
        System.out.print(hashMap + "\n");
        System.out.println("The age for Dung is " + hashMap.get("Dung") + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in TreeMap");
        System.out.println(treeMap);
        System.out.println("The age for Dung is " + treeMap.get("Dung") + "\n");

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Anh", 30);
        linkedHashMap.put("Bình", 34);
        linkedHashMap.put("Dung", 24);
        linkedHashMap.put("Hà", 26);
        linkedHashMap.put("Kiên", 27);
        linkedHashMap.put("Linh", 27);

        System.out.println("Display entries in LinkedHashMap");
        System.out.print(linkedHashMap);
        System.out.println("\nThe age for Dung is " + linkedHashMap.get("Dung"));
    }
}
