import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int [] arr=new int[n];
    int ans=-1;
    for(int i=0;i<n;i++){
        arr[i]=s.nextInt();
    }
    int tar=s.nextInt();
    
    for(int i=0;i<n;i++){
        if(arr[i]==tar){
            ans=i;
        }
    }
    
    System.out.println(ans);
   
    
    
 }

}
