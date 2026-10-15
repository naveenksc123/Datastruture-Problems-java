package twoPointers;
import java.util.*;
public class LongestPalindromicPrefixCheck {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        //char []arr=s.toCharArray();
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
                System.out.print("False");
                return;
            }
            left++;
            right--;
        }
        System.out.print("true");
    }

}
