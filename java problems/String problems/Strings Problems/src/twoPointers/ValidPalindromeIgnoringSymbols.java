package twoPointers;
import java.util.*;
public class ValidPalindromeIgnoringSymbols {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        String s=sc.nextLine();
        int left=0;
        int right=s.length()-1;
        while(left<right){
           // char ch=s.charAt(i);
            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(left))==Character.toLowerCase(s.charAt(right))){
                System.out.print("true");
                return;
            }
            left++;
            right--;
        }
        System.out.print("false");
    }
}
