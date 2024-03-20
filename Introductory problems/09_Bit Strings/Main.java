import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        long mod = 1000000007;
        long ans = 1;
        for (int i = 0; i < n; i++) {
            ans = ans * 2;
            ans = ans % mod;
        }
        System.out.println(ans);
    }
}
