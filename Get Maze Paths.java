import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        ArrayList<String>ans=getMazePaths(0,0,n-1,m-1);
        System.out.println(ans);

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        
        if(sr>dr || sc>dc){
            return new ArrayList<>();
        }
        
        if(sr==dr && sc==dc){
            ArrayList<String>bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        
        ArrayList<String>hpaths= getMazePaths(sr,sc+1,dr,dc);
        ArrayList<String>vpaths= getMazePaths(sr+1,sc,dr,dc);
        ArrayList<String>paths= new ArrayList<>();
        
        for(String hpath:hpaths){
            paths.add("h" + hpath);
        }
        for(String vpath:vpaths){
            paths.add("v" + vpath);
        }
        return paths;
        
    }

}
