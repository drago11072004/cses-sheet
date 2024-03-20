// import java.util.*;
// import java.io.*;

// public class Main {
//     public static void main(String[] args) throws java.lang.Exception{
//         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

//         String s = in.readLine();
//         int n = s.length();
//         int arr[]  = new int[27];

//         for (int i=0;i<n;i++){
//             arr[s.charAt(i)-'A'+1]+=1;
//         }
//         // for(int i=1;i<27;i++){
//         //     System.out.print(arr[i]+" ");
//         // }
//         System.out.println();
//         String ans="";
//         String ans2="";
//         boolean flag = true;
//         int k=0;
//         if(s.length()%2==0){
//             for(int i=1;i<27;i++){
//                 if(arr[i]%2==1) flag = false;
//             }
//             if(flag){
//                 for(int i=1;i<27;i++){
//                     for(int j=0;j<arr[i]/2;j++){
//                         ans=ans+(char)(i+64);
//                         ans2=(char)(i+64)+ans2;
//                     }
//                 }

//                 System.out.println(ans+ans2);
//             }
//             else{
//                 System.out.println("NO SOLUTION");
//             }
//         }
//         else{
//             int odd=-1;
//             for(int i=1;i<27;i++){
//                 if(arr[i]%2==1){
//                     k++;
//                     if(k==1){
//                         odd = i;
//                     }
//                     if(k==2){
//                         flag=false;
//                         break;
//                     }
//                 }
//             }
//             if(flag){
//                 for(int i=1;i<27;i++){
//                     int x = i+64;
//                     for(int j=0;j<arr[i]/2;j++){
//                         ans=ans+(char)x;
//                         ans2=(char)x+ans2;
//                     }
//                 }
//                 // System.out.println(ans);
//                 // System.out.println(ans2);
//                 System.out.println(ans+(char)(odd+64)+ans2);
//             }
//             else{
//                 System.out.println("NO SOLUTION");
//             }
//         }
//     }
// }
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();
        int n = s.length();
        int arr[] = new int[27];

        for (int i = 0; i < n; i++) {
            arr[s.charAt(i) - 'A' + 1]++;
        }

        StringBuilder ans = new StringBuilder();
        StringBuilder ans2 = new StringBuilder();
        int odd = -1;
        int k = 0;
        if (s.length() % 2 == 0) {
            for (int i = 1; i < 27; i++) {
                if (arr[i] % 2 == 1) {
                    System.out.println("NO SOLUTION");
                    return;
                }
            }
            for (int i = 1; i < 27; i++) {
                char c = (char) (i + 64);
                for (int j = 0; j < arr[i] / 2; j++) {
                    ans.append(c);
                    ans2.insert(0, c);
                }
            }
            System.out.println(ans.toString() + ans2.toString());
        } else {
            for (int i = 1; i < 27; i++) {
                if (arr[i] % 2 == 1) {
                    k++;
                    if (k == 1) {
                        odd = i;
                    }
                    if (k == 2) {
                        System.out.println("NO SOLUTION");
                        return;
                    }
                }
            }
            for (int i = 1; i < 27; i++) {
                char c = (char) (i + 64);
                for (int j = 0; j < arr[i] / 2; j++) {
                    ans.append(c);
                    ans2.insert(0, c);
                }
            }
            System.out.println(ans.toString() + (char) (odd + 64) + ans2.toString());
        }
    }
}
