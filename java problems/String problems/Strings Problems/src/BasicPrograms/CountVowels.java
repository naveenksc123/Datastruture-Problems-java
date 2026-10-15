package BasicPrograms;

import java.util.Scanner;
public class CountVowels {
    public static void main(String[]arg) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        System.out.print(count);
    }
}
