package twopointers;
/*
Remove Duplicates from Sorted Array
iNPUT:nums = [0,0,1,1,1,2,2,3,3,4]
OUTPUT:5 (array becomes [0,1,2,3,4,...])
 */
import java.util.*;
public class removeduplicates {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int left=0;
        for(int right=1;right<arr.length;right++){
            if(arr[left]!=arr[right]) {
                left++;
                arr[left] = arr[right];
            }
        }
      for(int i=0;i<=left;i++) {
          System.out.print(arr[i]+" ");
      }
      }
    }
