
import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     int n=scn.nextInt();
     for(int i = 1; i <= n; i++){
        for(int j = 1; j <= n; j++){
            if(j<= i){
            System.out.print(j+"\t");
            }
            else{ 
                    System.out.print("\t");
            }
        }
        for(int j = n - 1; j >= 1; j--){
            if(j <= i){ System.out.print(j+"\t");}
            else{ 
            System.out.print("\t");
            }
        }
        System.out.println();
        
     }

 }
}
