import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int[][]a=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=s.nextInt();
            }
        }
        for(int g = 0; g < a.length; g++){
         for(int i = 0, j = i + g; j < a.length; i++, j++){
            System.out.println(a[i][j]);
         }
        }
        
        
        
    }

}
