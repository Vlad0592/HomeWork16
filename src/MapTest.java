import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.*;

public class MapTest {


    private static final Map<String, ArrayList<Integer>> mapFrom = new LinkedHashMap<>();
    private static final Map<String, Integer> mapTo = new HashMap<>();

    public static void main(String[] args) {
        Random random = new Random();
        var listOne = new ArrayList<>(List.of(1, 2, 5, 6, 18));
        for (int i = 0; i < 15; i++) {
            listOne.add(random.nextInt(10));
        }
        var listTwo = new ArrayList<>(List.of(1, 2, 5, 6, 18));
        for (int i = 0; i < 15; i++) {
            listTwo.add(random.nextInt(10));
        }
        var listThree = new ArrayList<>(List.of(1, 2, 5, 6, 18));
        for (int i = 0; i < 15; i++) {
            listThree.add(random.nextInt(10));
        }
        mapFrom.put("List 1", listOne);
        mapFrom.put("List 2", listTwo);
        mapFrom.put("List 3", listThree);

        System.out.println(mapFrom);

        for (Map.Entry<String, ArrayList<Integer>> entry : mapFrom.entrySet()) {
            Integer sum = 0;
            List<Integer> tempList = entry.getValue();
            for (Integer integerSum : tempList) {
                sum += integerSum;

            }
            mapTo.put(entry.getKey(), sum);

        }
        System.out.println(mapTo);
        System.out.println(mapFrom);
    }
}

