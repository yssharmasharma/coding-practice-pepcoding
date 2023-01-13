import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner s= new Scanner(System.in);
    int n1=s.nextInt();
    int [] arr1=new int[n1];
    for(int i=0;i<n1;i++){
        arr1[i]=s.nextInt();
    }
    int n2=s.nextInt();
    int [] arr2=new int[n2];
    for(int i=0;i<n2;i++){
        arr2[i]=s.nextInt();
    }
    
    int n3=Math.max(n1,n2);
    int [] arr3=new int[n1>n2?n1:n2];
    int c=0;
    int i=arr1.length-1;
    int j=arr2.length-1;
    int k=arr3.length-1;
    while(k>=0){
        int d=c;
        if(i>=0){
            d+=arr1[i];
        }
        if(j>=0){
            d+=arr2[j];
        }
        c=d/10;
        d=d%10;
        
        arr3[k]=d;
        i--;
        j--;
        k--;
    }
    if(c!=0){
        System.out.print(c);
    }
    
    for(int val : arr3){
        System.out.println(val);}
    
   
    
    
}

}
