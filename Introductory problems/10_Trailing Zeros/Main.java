import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        // long startTime = System.currentTimeMillis();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(in.readLine());
        long cur = 5, ans = 0;
        while (cur <= n) {
            ans+=n/cur;
            cur*=5;
        }
        System.out.println(ans);

        // // Your main code goes here

        // // Capture the end time
        // long endTime = System.currentTimeMillis();

        // // Calculate the runtime
        // long runtime = endTime - startTime;

        // // Print the runtime in milliseconds
        // System.out.println("Runtime: " + runtime + " milliseconds");
    }
}
