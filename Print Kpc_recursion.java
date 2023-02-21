import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        printKPC(str,"");
        
        

    }
    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx",
                           "yz"
                          };    

    public static void printKPC(String str, String asf) {
        
        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        
        char ch=str.charAt(0);
        String roq=str.substring(1);
        for(char charcode :codes[ch-48].toCharArray()){
            printKPC(roq,asf+charcode);
        }
        
    }

}
