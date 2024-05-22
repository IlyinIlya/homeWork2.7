import java.util.*;

import static java.util.Collections.sort;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        List<Integer> numsOne = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Iterator<Integer> numsItOne = numsOne.iterator();
        while (numsItOne.hasNext()) {
            Integer num = numsItOne.next();
            if(num % 2 == 0) {
                numsItOne.remove();
            }
        }
        System.out.println(numsOne);

        System.out.println("Task 2");
        List<Integer> numsTwo = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Iterator<Integer> numsItTwo = numsTwo.iterator();
        while (numsItTwo.hasNext()) {
            Integer num = numsItTwo.next();
            if(num % 2 != 0) {
                numsItTwo.remove();
            }
        }
        sort(numsTwo);
        System.out.println(numsTwo);

        System.out.println("Task 3");

    }
}