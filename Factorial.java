import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=factorial(n);
        System.out.println(a);
    }

    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fm=factorial(n-1);
        int f=fm*n;
        return f;
    
    }

}
