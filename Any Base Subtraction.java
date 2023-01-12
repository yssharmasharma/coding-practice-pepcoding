import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getDifference(int b, int n1, int n2){
       // write your code here
       int num1= getValueIndecimal(n1,b);
       int num2= getValueIndecimal(n2,b);
       int value=num2-num1;
       int ans=getValueInBase(value,b);
       return ans;
       
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
  
  
