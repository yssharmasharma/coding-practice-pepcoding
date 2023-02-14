import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int x=s.nextInt();
        int val=firstIndex(a,0,x);
        System.out.println(val);
    }

    public static int firstIndex(int[] arr, int idx, int x){
        int y=arr[idx];
        if(idx==arr.length){
            return -1;
        }
        if(arr[idx]==x){
            return idx;
            
            
        }
        else{
            int fis=firstIndex(arr,idx+1,x);
            return fis;
        }
        
           
    }
    

}
