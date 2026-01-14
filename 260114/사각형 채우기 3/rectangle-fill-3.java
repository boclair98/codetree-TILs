import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;

public class Main {
    static StringBuilder sb;
    static StringTokenizer st;
    static int n, count;
    static int[] dp = new int[1010];
    static int recur(int size){
        if(dp[size] != -1) return dp[size];
        if(size == 0) return 1;
        if(size == 1) return 2;
        if(size == 2) return 7;
        dp[size] = (recur(size - 1) * 3 + recur(size - 2) - recur(size - 3) + 1000000007) % 1000000007;;
        return dp[size];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        Arrays.fill(dp,-1);
        System.out.println(recur(n));
    }
}