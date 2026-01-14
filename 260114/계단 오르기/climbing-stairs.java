import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;

public class Main {
    static StringBuilder sb;
    static StringTokenizer st;
    static int n, count;
    static int[] dp = new int[1010];
    static int recur(int step){
        if(step > n) return 0;
        if(step == n) return 1;
        if(dp[step] != -1) return dp[step];
        int ans = 0;
        ans += recur(step + 2);
        ans += recur(step + 3);
        return dp[step] = ans % 10007;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        Arrays.fill(dp,-1);
        System.out.println(recur(0));
    }
}