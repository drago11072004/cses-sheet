import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        System.out.println(0);
        for(int i=2;i<=n;i++){
            long a = ((long) i * i * (i * i - 1)) / 2;
            long b = 4 * (i-1)*(i-2);
            long ans = a-b;
            System.out.println(ans);
        }
    }
}
