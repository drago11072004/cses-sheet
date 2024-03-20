import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        String[] input = in.readLine().split(" ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(input[i]);
        }
        long ans =0;
        for (int i=1;i<n;i++){
            if(arr[i-1]>arr[i]){
                ans+=arr[i-1]-arr[i];
                arr[i]=arr[i-1];
            }
        }
        System.out.print(ans);
    }
}
