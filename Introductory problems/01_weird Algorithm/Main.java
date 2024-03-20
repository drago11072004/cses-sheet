import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(in.readLine());
        System.out.print(n + " ");
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            System.out.print(n + " ");

        }
    }
}


// import java.util.*;
// import java.io.*;

// public class Main {
//     public static void main(String[] args) throws java.lang.Exception{
//         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//         int n = Integer.parseInt(in.readLine());
//         for (int p = 0; p < zz; p++) {
//         int n = Integer.parseInt(in.readLine());
//         String[] input = in.readLine().split(" ");
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = Integer.parseInt(input[i]);
//             }
//         }
//     }
// }


// public static void main(String[] args) throws java.lang.Exception {

// }

// BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
// int zz = Integer.parseInt(in.readLine());
// for (int p = 0; p < zz; p++) {
// // int n = Integer.parseInt(in.readLine());
// // String[] input = in.readLine().split(" ");
// // int[] arr = new int[n];
// // for (int i = 0; i < n; i++) {
// // arr[i] = Integer.parseInt(input[i]);
// // }
// String[] in1 = in.readLine().split(" ");
// String[] in2 = in.readLine().split(" ");
// String[] in3 = in.readLine().split(" ");
// int px = Integer.parseInt(in1[0]); int py = Integer.parseInt(in1[1]);
// int ax = Integer.parseInt(in2[0]); int ay = Integer.parseInt(in2[1]);
// int bx = Integer.parseInt(in3[0]); int by = Integer.parseInt(in3[1]);

// }
