package twopointers;
/*
Valid Palindrome
INPUT:s = "A man, a plan, a canal: Panama"
OUTPUT:true
 */
import java.util.*;
public class validpalindrome {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
                System.out.print("false");
                return;
            }
            left++;
            right--;
        }
        System.out.print("true");
    }
}
