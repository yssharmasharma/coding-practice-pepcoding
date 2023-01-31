import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int n=s.nextInt();
        int ans=power(x,n);
        System.out.println(ans);
    }
    

    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
       
        if(n==1){
            return x;
        }
        int po=power(x,n-1);
        po*=x;
        return po;
    }

}
