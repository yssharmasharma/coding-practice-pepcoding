import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int [] a= new int[n];
    for(int i=0;i<n;i++){
        a[i]=s.nextInt();
    }
    
    int max=a[0];
    for(int i=0;i<n;i++){
        if(a[i]>max){
            max=a[i];
        }
    }
    
    for(int i=0;i<max;i++){
        for(int val:a){
            if(i<val){
            System.out.print("*\t");
            
        }
        else{
            System.out.print("\t");
            
        }
    }
    System.out.println();
    }
    
  }

}
