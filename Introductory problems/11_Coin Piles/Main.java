import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int zz = Integer.parseInt(in.readLine());
        for (int mn = 0; mn < zz; mn++) {
            String[] input = in.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            int p = 2 * a - b;
            int q = 2 * b - a;
            if (p >= 0 && q >= 0 && p % 3 == 0 && q % 3 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}
