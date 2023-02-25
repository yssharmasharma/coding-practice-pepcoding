import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    // code
    Stack<Integer>st=new Stack<>();
    st.push(a.length-1);
    
    int []rb=new int[a.length];
    rb[a.length-1]=a.length;
    for(int i=a.length-2;i>=0;i--){
        while(st.size()>0 && a[i]<=a[st.peek()]){
            st.pop();
        }
        if(st.size()==0){
            rb[i]=a.length;
        }
        else{
            rb[i]=st.peek();
        }
        st.push(i);
    }
    int []lb=new int[a.length];
    st=new Stack<>();
    st.push(0);
    lb[0]=-1;
    for(int i=1;i<a.length;i++){
        while(st.size()>0 && a[i]<=a[st.peek()]){
            st.pop();
        }
        if(st.size()==0){
            lb[i]=-1;
        }
        else{
            lb[i]=st.peek();
        }
        st.push(i);
    }
    int max=0;
    for(int i=0;i<a.length;i++){
        int width=rb[i]-lb[i]-1;
        int area=width*a[i];
        if(area>max){
            max=area;
        }
    }
    System.out.println(max);
 }
}
