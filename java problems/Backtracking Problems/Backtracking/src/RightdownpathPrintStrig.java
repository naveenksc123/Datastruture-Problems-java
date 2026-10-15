import java.util.*;
public class RightdownpathPrintStrig {
    static int RightDownPaths(int n,int row,int col,String path){
        if(row>n||col>n){
            return 0;
        }
        if(row==n&&col==n){
            System.out.println(path);
            return 1;
        }
        int down=RightDownPaths(n,row+1,col,path+"d");
        int right=RightDownPaths(n,row,col+1,path+"r");
        return down+right;
        //return paths;
    }
    public static void main (String[]args){
        int n=4;
        int row=0,col=0;
        System.out.print(RightDownPaths(n,row,col," "));
    }}

