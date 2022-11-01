import java.util.*;

public class Task1x3 {

    private static Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        map.put("str1", 5);
        map.put("str2", 1);
        map.put("str1", 6);
        System.out.println(map);
    }

    public static void addToMap(String str, Integer count) {
        if (map.containsKey(str) && map.get(str).equals(count)) {
            throw new RuntimeException("Нет возможности добавить");
        }

        map.put(str, count);
    }
}


