import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     int value=getValueIndecimal(n,sourceBase);
     int ans=getValueInBase(value,destBase);
     System.out.println(ans);
     
   }  
   
    public static int getValueIndecimal(int n, int b){
      // write your code here
      int sum=0;
      int factor=1;
      while(n>0){
          int r= n%10;
          n=n/10;
          sum+=r*factor;
          factor=factor*b;
      }
      return sum;
   }
   public static int getValueInBase(int n, int b){
       // write code here
       int factor=1;
       int sum=0;
       while(n>0){
           int r=n%b;
           n=n/b;
           sum+=factor*r;
           factor*=10;
       }
       return sum;
   }
   
  }
