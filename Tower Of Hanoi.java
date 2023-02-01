import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int t1id=s.nextInt();
        int t2id=s.nextInt();
        int t3id=s.nextInt();
        toh(n,t1id,t2id,t3id);
    }

    public static void toh(int n, int t1id, int t2id, int t3id){
        
        if(n==0){
            return;
        }
        
        toh(n-1,t1id,t3id,t2id);
        System.out.println(n+ "[" + t1id + " -> " + t2id + "]");
        toh(n-1, t3id,t2id,t1id);
    }

}
