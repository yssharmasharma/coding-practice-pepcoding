import java.io.*;
import java.util.*;

public class Main {

	public static String toggleCase(String str){
		//write your code here
		StringBuilder ans=new StringBuilder();
		for(int i=0;i<str.length();i++){
		    char ch=str.charAt(i);
		    if(ch>='a' && ch<='z'){
		        ans.append((char)(ch-'a'+'A')+"");
		    }
		    else{
		        ans.append((char)(ch-'A'+'a')+"");
		    }
		}

		return ans.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}
