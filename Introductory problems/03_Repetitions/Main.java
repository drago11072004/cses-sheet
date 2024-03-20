import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();
        int ans = 1, len =1;
        for (int i=0; i < s.length()-1; i++) {
            if(s.charAt(i)==(s.charAt(i+1))){
                len++;
                ans=Math.max(ans,len);
            }
            else{
                len=1;
            }
        }
        System.out.println(ans);
    }
}
