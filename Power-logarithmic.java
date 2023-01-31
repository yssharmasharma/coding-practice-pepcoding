import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int n=s.nextInt();
        int p=power(x,n);
        System.out.println(p);
    }

    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        
        int pow=power(x,n/2);
        int pow2=pow*pow;
        if(n%2==1){
            pow2=pow2*x;
        }
        return pow2;
    }

}
