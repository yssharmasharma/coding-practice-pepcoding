import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner s= new Scanner(System.in);
    int n=s.nextInt();
    int []a=new int[n];
    for(int i=0;i<n;i++){
        a[i]=s.nextInt();
    }
    int d=s.nextInt();
    int min=0;
    int max=0;
    
    for(int i=0;i<n;i++){
        if(a[i]==d){
            System.out.println(a[i]);
        }
        
    }
        for(int i=0;i<n;i++){
        if(a[i]>=d){
            max=a[i];
            break;
        }
        }
        
        for(int i=0;i<n;i++){
            
         if(a[i]<=Math.ceil(d)){
            min=a[i];
        }
         }
    
    System.out.println(max);
     System.out.println(min);
 }

}
