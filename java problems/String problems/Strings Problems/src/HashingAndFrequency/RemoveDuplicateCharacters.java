package HashingAndFrequency;
/*
INPUT=programming
OUTPUT:progamin
 */
import java.util.*;
public class RemoveDuplicateCharacters {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        LinkedHashSet<Character> set = new LinkedHashSet<>();;
       for(int i=0;i<s.length();i++){
           set.add(s.charAt(i));
       }
       Character[] arr=set.toArray(new Character[0]);
       for(int i=0;i<arr.length;i++){
       System.out.print(arr[i]);
       }
    }

}
