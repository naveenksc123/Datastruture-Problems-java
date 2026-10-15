package SlidingWindow;
import java.util.*;
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashSet<Character>set=new HashSet<>();
        int left=0;
        int count=0;
        int maxlength=0;
        for(int right=0;right<s.length()-1;right++){
            char ch=s.charAt(right);
            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
                count--;
            }
            set.add(ch);
            count++;
     maxlength=Math.max(maxlength,count);
        }
        System.out.print(maxlength);
    }
}
