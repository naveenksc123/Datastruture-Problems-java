package slidingwindow;
/*
Maximum Number of Vowels in a Substring of Given Length
INPUT:s = "abciiidef", k = 3
OUTPUT
3
 */
import java.util.*;
public class MaxNumberOfVowelsInASubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        int count = 0;
        int left = 0;
        int maxcount = 0;
        for (int right = 0; right < s.length() - 1; right++) {
            char ch = s.charAt(right);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count++;
                }
            if (right - left + 1 == k) {
                maxcount = Math.max(maxcount, count);
                char leftchar=s.charAt(left);
                if (leftchar == 'a' || leftchar == 'e' || leftchar == 'i' || leftchar== 'o' || leftchar == 'u') {
                    count--;
                }
                left++;
             }
        }
        System.out.print(maxcount);
    }
}
