import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        if(n==1) System.out.println(n);
        else if(n==2 || n==3) System.out.println("NO SOLUTION");
        else{
            for(int i=2;i<n+1;i=i+2){
                System.out.print(i+" ");
            }
            for(int i=1;i<n+1;i=i+2){
                System.out.print(i+" ");
            }
        }
    }
}
