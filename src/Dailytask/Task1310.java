package Dailytask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1310 {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(0, 1, 1, 2, 3, 5, 6, 0, 0, 1);
        List<Integer> uniqueList = new ArrayList<>();

        for (Integer element : input) {
            boolean isDuplicate = false;

            for (Integer uniqueElement : uniqueList) {
                if (element.equals(uniqueElement)) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                uniqueList.add(element);
            }
        }

        System.out.println(uniqueList);
    }
}
