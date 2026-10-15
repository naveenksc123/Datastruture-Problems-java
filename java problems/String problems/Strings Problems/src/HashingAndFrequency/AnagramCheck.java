package HashingAndFrequency;
/*
Question: Check whether two strings contain the same characters with the same frequencies.
Input:
listen
silent
Output:
Anagram
 */
import java.util.*;
public class AnagramCheck {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        if(s1.length()!=s2.length()){
            System.out.print("not frequency");
            return;
        }
        int freq[]=new int[256];
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
            freq[s2.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                System.out.print("Anagram");
                return;
            }
        }
        System.out.print("Same Frequency");
    }
}
