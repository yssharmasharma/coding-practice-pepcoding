import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int x=s.nextInt();
        int fi=lastIndex(a,0,x);
        System.out.println(fi);
    }

    public static int lastIndex(int[] arr, int idx, int x){
        if(idx==arr.length){
            return -1;
        }
        int liisa=lastIndex(arr,idx+1,x);
        if(liisa!=-1){
            return liisa;
        }
        else if(arr[idx]==x){
            return idx;
        }
        else{
            
            return -1;
        }
    }

}
