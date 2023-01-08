
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        int prod=1;
        for(int i=1;i<=10;i++){
            prod=n*i;
            System.out.println(n+" * "+i+" = "+prod);
            
        }

    }
}
