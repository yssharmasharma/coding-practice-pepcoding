import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        printEncodings(str,"");

    }

    public static void printEncodings(String str,String ans) {
        
        if(str.length()==0){
            System.out.println(str);
            return;
        }
        
        if(str.length()==1){
            char ch=str.charAt(0);
            if(ch=='0'){
                return;
            }
            else{
                int chv=ch-'0';
                char code=(char)('a'+chv-1);
                ans=ans+code;
                System.out.println(ans);
            }
            
        }
        else{
            char ch=str.charAt(0);
            String roq=str.substring(1);
            
            if(ch=='0'){
                return;
            }
            else{
                int chv=ch-'0';
                char code=(char)('a'+chv-1);
                printEncodings(roq,ans+code);
            }
            String ch12=str.substring(0,2);
            String roq12=str.substring(2);
            
            int ch12v=Integer.parseInt(ch12);
            if(ch12v<=26){
                char code=(char)('a'+ch12v-1);
                printEncodings(roq12,ans+code);
            }
        }
        
    }

}