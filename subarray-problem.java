import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner s= new Scanner(System.in);
    int n=s.nextInt();
    int [] a=new int[n];
    for(int i=0;i<n;i++){
        a[i]=s.nextInt();
    }
    for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
            for(int k=i;k<=j;k++){
                System.out.print(a[k]+"\t");
            }
            System.out.println();
            
        }
    
    }
 }

}
