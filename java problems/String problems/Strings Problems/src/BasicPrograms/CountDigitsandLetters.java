package BasicPrograms;

import java.util.Scanner;
public class CountDigitsandLetters {
    public static void main(String[]arg) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int l=0;
        int d=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetter(ch)){
                l++;
            }else{
                d++;
            }
        }
        System.out.print(l+" "+d);
    }
}
