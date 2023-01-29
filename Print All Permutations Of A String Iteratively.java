import java.io.*;
import java.util.*;

public class Main {

	public static void solution(String str){
		// write your code here
		int len=str.length();
		int total=fact(len);
		for(int i=0;i<total;i++){
		    StringBuilder sb=new StringBuilder(str);
		    int temp=i;
		    for(int divisor=len;divisor>=1;divisor--){
		        int q=temp/divisor;
		        int r=temp%divisor;
		        System.out.print(sb.charAt(r));
		        sb.deleteCharAt(r);
		        temp=q;
		        
		    }
		    System.out.println();
		}
	}
	public static int fact(int len){
	    int fact=1;
	    for(int i=2;i<=len;i++){
	        fact*=i;
	    }
	    return fact;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}
