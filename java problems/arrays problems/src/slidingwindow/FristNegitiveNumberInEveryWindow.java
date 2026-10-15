package slidingwindow;
/*
First Negative Number in Every Window of Size K
INPUT:arr = [12, -1, -7, 8, -15, 30, 16, 28], k = 3
OUTPUT:[-1, -1, -7, -15, -15, 0]
 */
import java.util.*;
public class FristNegitiveNumberInEveryWindow {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int left=0;
        for(int right=0;right<arr.length;right++){
            if(right-left+1==k){
                int fristneg=0;
                for(int i=left;i<right;i++){
                    if(arr[i]<0) {
                        fristneg=arr[i];
                        break;

                    }
                }
                System.out.print(fristneg+" ");
                left++;
            }
        }
    }

}
