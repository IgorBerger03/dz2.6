import java.util.*;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<Integer> nums2 = new ArrayList<>(List.of(32, 72, 1, 2, 3, 4, 4, 56, 5, 6, 7));
    private static final List<String> words = new ArrayList<>(List.of("abc", "abc", "cc", "power", "car", "car"));

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1(){
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }
    public static void task2(){
        Collections.sort(nums2);
        for (Integer num : nums2) {
            if (num % 2 == 0){
                System.out.println(num);
            }
        }
    }
    public static void task3(){
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);

    }
    public static void task4(){
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(words.size() - uniqueWords.size());
    }

}