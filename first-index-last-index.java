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
    int max=0;
    int min=0;
    int d= s.nextInt();
    for(int i=0;i<n;i++){
        if(a[i]==d){
            min=i;
            break;
        }
    }
    for(int i=0;i<n;i++){
        if(a[i]==d){
            max=i;
            
        }
    }
    System.out.println(min);
     System.out.println(max);
    
    
 }

}
