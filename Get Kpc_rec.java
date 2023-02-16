import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        ArrayList<String>ans=getKPC(str);
        System.out.println(ans);

    }
    
    static String[] codes={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static ArrayList<String> getKPC(String str) {
        if(str.length()==0){
            ArrayList<String>bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch=str.charAt(0);
        String ros=str.substring(1);
        ArrayList<String>rres=getKPC(ros);
        ArrayList<String>mres=new ArrayList<>();
        for(char chcode:codes[ch-48].toCharArray()){
            for(String rstr:rres){
                mres.add(chcode+rstr);
            }
        }
        return mres;
    }

}
