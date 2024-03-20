import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int mod = n % 4;
        if (mod == 1 || mod == 2)
            System.out.println("NO");
        else if (mod == 0) {
            int a = n / 4;
            System.out.println("YES");
            System.out.println(2 * a);
            System.out.println();
            for (int i = 1; i <= a; i++) {
                System.out.print(i + " ");
            }
            for (int i = n - a + 1; i <= n; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.println(2*a);
            for (int i = a + 1; i < n - a + 1; i++) {
                System.out.print(i + " ");
            }
        } else {
            boolean[] vis = new boolean[n + 1];
            for (int i = 0; i <= n; i++) {
                vis[i] = false;
            }
            long total_sum = 1L *n * (1L *n + 1) / 2;
            int max_element = n;
            long set1_sum = 0;
            int set1_len = 0;
            while (set1_sum < total_sum / 2) {
                long remaining_sum = total_sum / 2 - set1_sum;
                if (remaining_sum > max_element) {
                    vis[max_element] = true;
                    set1_sum+=max_element;
                    
                    max_element = max_element-  1;
                    set1_len++;
                } else {
                    vis[(int) remaining_sum] = true;
                    set1_sum = total_sum / 2;
                    set1_len++;
                }
            }
            System.out.println("YES");
            System.out.println(set1_len);
            // System.out.println();
            for (int i = 1; i <= n; i++) {
                if (vis[i])
                    System.out.print(i + " ");
            }

            System.out.println(n - set1_len);
            // System.out.println();
            for (int i = 1; i <= n; i++) {
                if (!vis[i])
                    System.out.print(i + " ");
            }

        }
    }
}
