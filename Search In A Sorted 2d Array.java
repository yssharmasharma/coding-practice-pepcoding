import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int [][]a=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=s.nextInt();
            }
        }
        int row=0;
        int col=0;
        boolean flag=false;
        int x=s.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(x==a[i][j]){
                    row=i;
                    col=j;
                    flag=true;
                    break;
                    
                }
            }
        }
        if(flag==true){
            System.out.println(row);
            System.out.println(col);
        }
        else{
            System.out.println("Not Found");
        }
        
    }

}
