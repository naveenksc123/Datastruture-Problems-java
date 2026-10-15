package twopointers;
/*
Two Sum II - Input Array Is Sorted
INPUT:numbers = [2, 7, 11, 15], target = 9
OUTPUT:[1,2]
 */
import java.util.Scanner;

/*public class twosum {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int sum;
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++) {
                sum = arr[i] + arr[j];
                if (sum == target) {
                    System.out.print((i+1) + " " +(j+1));
                }
            }
        }
    }
}/*
optimal solution
 */
public class twosum {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int left=0;
        int right=n-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                System.out.print((left+1)+" "+(right+1));
              return;
            }else if(sum < target){
                left++;
            }
            right--;
        }
    }
}

