import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        String[] input = in.readLine().split(" ");
        int[] arr = new int[n-1];
        for(int i=0;i<n-1;i++){
            arr[i] = Integer.parseInt(input[i]);
        }
        Boolean[] arr1 = new Boolean[n+1];
        for (int i=0;i<n+1;i++){
            arr1[i] = false;
        }
        for (int i=0;i<n-1;i++){
            arr1[arr[i]] = true;
        }
        for (int i=1;i<n+1;i++){
            if(!arr1[i]){
                System.out.println(i);
                break;
            }
        }
    }
}