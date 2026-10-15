import java.util.Scanner;
public class twoarraysum {
        public static void main(String[]args){
            Scanner sc=new Scanner (System.in);
            int n=sc.nextInt();
            int nums1[]=new int[n];
            for(int i=0;i<n;i++){
                nums1[i]=sc.nextInt();
            }
            int nums2[]=new int[n];
            for(int i=0;i<n;i++){
                nums2[i]=sc.nextInt();
            }
            int result[]=new int[n];
            for(int i=0;i<n;i++){
                result[i]=nums1[i]+nums2[i];
            }
            for(int i=0;i<n;i++){
                System.out.print(result[i]+" ");
            }
        }

    }

