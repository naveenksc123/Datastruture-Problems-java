package SlidingWindow;
import java.util.*;
public class LongestSubstringwithKDistinctCharacters {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int count = 0;
        for (int right = 0; right < s.length() - 1; right++) {
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            count++;

        }

    }
}
