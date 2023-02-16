import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner s= new Scanner(System.in);
        String str=s.nextLine();
        ArrayList<String>ans=new ArrayList<>();
        ans=gss(str);
        System.out.println(ans);
        

    }

    public static ArrayList<String> gss(String str) {
        if(str.length()==0){
            ArrayList<String>bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch=str.charAt(0);
        String ros=str.substring(1);
        ArrayList<String>rres=gss(ros);
        ArrayList<String>mres=new ArrayList<>();
        for(String ss:rres){
            mres.add(""+ss);
        }
        for(String ss:rres){
            mres.add(ch+ss);
        }
        return mres;
    }

}
