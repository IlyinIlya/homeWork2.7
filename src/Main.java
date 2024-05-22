import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer numOne : nums) {
            if (numOne % 2 != 0) {
                System.out.print(numOne);
            }
        }
        System.out.println("");
        System.out.println("Task 2");
        Set<Integer> numb = new HashSet<>(nums);
        for (Integer numTwo : numb) {
            if (numTwo % 2 != 1) {
                System.out.print(numTwo);
            }
        }
        System.out.println("");
        System.out.println("Task 3");
        List<String> words = new ArrayList<>(List.of("один", "один", "два", "три",
                "четыре", "четыре", "пять", "пять", "шесть", "семь"));
        Set<String> wordOne = new LinkedHashSet<>(words);
        System.out.println(wordOne);

        System.out.println("");
        System.out.println("Task 4");
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Set<String> wordTwo = new LinkedHashSet<>(strings);
        for (String k : wordTwo) {
            int count = Collections.frequency(strings, k);
            System.out.println(k + ": " + count);
        }

    }

}
