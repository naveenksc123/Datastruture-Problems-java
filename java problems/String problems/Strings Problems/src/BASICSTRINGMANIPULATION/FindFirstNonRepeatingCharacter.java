package BASICSTRINGMANIPULATION;

import java.util.Scanner;
public class FindFirstNonRepeatingCharacter {
    public static void main(String[] rgs) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.print(s.charAt(i));
                break;
            }
        }
    }
}
