package BASICSTRINGMANIPULATION;
import java.util.*;
public class CheckPalindrome {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int left=0;
        int right=s.length()-1;
        boolean palindrome=true;
        while(left<right) {
            if (s.charAt(left) != s.charAt(right)) {
                palindrome = false;
                break;
            }
            left++;
            right--;
        }
        if(palindrome){
                System.out.print("palindrome");
            }
        else{
            System.out.print(" not palindrome");
        }

    }

}
