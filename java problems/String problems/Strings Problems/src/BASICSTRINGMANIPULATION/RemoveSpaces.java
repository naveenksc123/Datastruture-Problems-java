package BASICSTRINGMANIPULATION;

import java.util.Scanner;
public class RemoveSpaces {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=' '){
                sb.append(ch);
            }
        }
        System.out.print(sb);
    }
}
