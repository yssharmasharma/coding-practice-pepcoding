import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        
        int n=scn.nextInt();
        int spaces=1;
        int star=n/2+1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=star;j++){
                System.out.print("*\t");
            }
            for(int k=1;k<=spaces;k++){
            System.out.print("\t");
            
            }
            
            for(int j=1;j<=star;j++){
                System.out.print("*\t");
            }
            if(i<=n/2){
                spaces+=2;
                star--;
                
            }
            else {
                spaces-=2;
                star++;
            }
            System.out.println();
            
            
            
            
        }

    }
}
