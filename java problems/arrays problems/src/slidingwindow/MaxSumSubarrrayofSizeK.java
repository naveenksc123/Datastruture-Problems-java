package slidingwindow;
/*
Maximum Sum Subarray of Size K
INPUT:arr = [2, 1, 5, 1, 3, 2], k = 3
OUTPUT:
9
 */

import java.util.Scanner;

public class MaxSumSubarrrayofSizeK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int left=0;
        int maxsum=Integer.MIN_VALUE;
        int sum=0;
        for(int right=0;right<n;right++){
            sum+=arr[right];
            if(right-left+1==k){
                maxsum=Math.max(maxsum,sum);
                sum-=arr[left];
                left++;
            }

        }
        System.out.print(maxsum);
    }
}
