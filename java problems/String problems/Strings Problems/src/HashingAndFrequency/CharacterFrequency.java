package HashingAndFrequency;
/*
Question: Print the frequency of every character.
Input
Output
banana
b = 1
a = 3
n = 2
 */
import java.util.*;
public class CharacterFrequency {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        HashMap<Character,Integer>map=new HashMap<>();
      for(int i=0;i<s.length();i++){
          char ch=s.charAt(i);
          map.put(ch,map.getOrDefault(ch,0)+1);

      }
      System.out.print(map);
    }
}