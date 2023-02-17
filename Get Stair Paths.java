import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        ArrayList<String>ans=getStairPaths(n);
        System.out.println(ans);

    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n<=0){
            ArrayList<String>bres=new ArrayList<>();
            if(n==0){
                bres.add("");
                
            }
            return bres;
            
        }
        
        ArrayList<String> ress1=getStairPaths(n-1);
        ArrayList<String> ress2=getStairPaths(n-2);
        ArrayList<String> ress3=getStairPaths(n-3);
        
        ArrayList<String>mres=new ArrayList<>();
        
        for(String rstr:ress1){
            mres.add(1+rstr);
            
        }
         for(String rstr:ress2){
            mres.add(2+rstr);
            
        }
         for(String rstr:ress3){
            mres.add(3+rstr);
            
        }
        return mres;
    }

}
