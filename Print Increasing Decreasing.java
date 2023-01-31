import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        pdi(n);
        
    }

    public static void pdi(int n){
        
        dec(n);
        inc(n);
        
       
    }
    
    public static void dec(int n){
        
         while(n>0){
            System.out.println(n);
            dec(n-1);
            break;
            
        }
        
    }
    
    public static void inc(int n){
        
        if(n==0){
            return;
        }
        inc(n-1);
        System.out.println(n);
    }

}
