package practiceCodeTT;

import java.io.*;
import java.util.*;


public class Mod {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++) {
            int N = Integer.parseInt(br.readLine().trim());

            String out_ = Solve(N);
            System.out.println(out_);
         }

         wr.close();
         br.close();
    }
    static String Solve(int N){
        // Write your code here
        int i = 1;
        int sum = 0;
        while(i < N){
            if(N%i == 0){
               sum = sum + N;
               i++;
            }
        }System.out.print(sum);
        if(sum == N)
            return "YES";
            return "NO";
    }
}
