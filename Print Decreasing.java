import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        printDecreasing(n);
    }

    public static void printDecreasing(int n){
        while(n>0){
            System.out.println(n);
            printDecreasing(n-1);
            break;
        }
        

    }

}
