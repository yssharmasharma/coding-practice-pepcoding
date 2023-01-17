import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int m=s.nextInt();
        int[][]a=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=s.nextInt();
            }
        }
        
        int cnt=0;
        int tne=n*m;
        int minr=0;
        int minc=0;
        int maxr=n-1;
        int maxc=m-1;
        while(cnt<tne){
            for(int i=minr;i<=maxr && cnt<tne;i++){
                System.out.println(a[i][minc]);
                cnt++;
            }
            minc++;
            for(int j=minc;j<=maxc && cnt<tne;j++){
                System.out.println(a[maxr][j]);
                cnt++;
            }
            maxr--;
            for(int i=maxr;i>=minr && cnt<tne;i--){
                System.out.println(a[i][maxc]);
                cnt++;
            }
            maxc--;
            
            for(int j=maxc;j>=minc && cnt<tne;j--){
                System.out.println(a[minr][j]);
                cnt++;
            }
            minr++;
        }
    }

}
