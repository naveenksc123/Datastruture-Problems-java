package twoPointers;
import java.util.*;
public class ReverseOnlyLetters {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr=s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
       char temp;
        while (left < right) {
            if (!Character.isLetter(arr[left])) {
                left++;
                continue;
            }
            if (!Character.isLetter(arr[right])) {
                right--;
                continue;
            }
            temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        System.out.print(new String(arr));
    }
}
