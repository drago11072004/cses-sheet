import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)  {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int ans=0;
        if(y>=x){
            if(y%2==1){
                ans=y*y-x+1;
            }
            else{
                ans = (y-1)*(y-1)+x;
            }
        }
        else{
            if(x%2==0){
                ans = x*x-y+1;
            }
            else{
                ans = (x-1)*(x-1)+y;
            }
        }

        System.out.println(ans);
    }
}