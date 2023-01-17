import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
     Scanner s= new Scanner(System.in);
    int n1=s.nextInt();
    int m1=s.nextInt();
    int [][] a= new int[n1][m1];
    for(int i=0;i<n1;i++){
        for(int j=0;j<m1;j++){
            a[i][j]=s.nextInt();
            
        }
    }
    
    int n2=s.nextInt();
    int m2=s.nextInt();
    int [][] b= new int[n2][m2];
    for(int i=0;i<n2;i++){
        for(int j=0;j<m2;j++){
            b[i][j]=s.nextInt();
            
        }
    }
    
    int [][] c=new int[n1][m2];
    
    
    if(m1==n2){
        for(int i=0;i<n1;i++){
            for(int j=0;j<m2;j++){
                int sum=0;
                for(int k=0;k<m1;k++){
                    sum+=a[i][k]*b[k][j];
                }
                c[i][j]=sum;
                
            }
        }
         for (int i = 0; i < n1; i++) {
         for (int j = 0; j < m2; j++) {
            System.out.print(c[i][j] + " ");
         }
         System.out.println();
      }
        
        
    }
    else{
        System.out.println("Invalid input");
    }
 }

}
