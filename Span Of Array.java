import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int [] arr=new int [n];
    for(int i=0;i<n;i++){
        arr[i]=scn.nextInt();
        
    }
    Arrays.sort(arr);
   int  ans=arr[n-1]-arr[0];
    System.out.println(ans);
 }

}
