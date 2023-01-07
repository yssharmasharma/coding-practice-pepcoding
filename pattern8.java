import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        int step=n;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n;j++){
                if(j==step){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
                
            }
            step--;
            System.out.println();
           
        }

    }
}
