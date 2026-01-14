import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n;
    static int[] dp = new int[1010];
    static final int MOD = 1000000007;

    static int recur(int size){
        // 1. 음수 처리를 최우선으로 (배열 참조 에러 방지)
        if(size < 0) return 0;
    
        if(size == 0) return 1;
        if(size == 1) return 2;
        if(size == 2) return 7;

        // 3. 메모이제이션 (이미 계산된 값인지 확인)
        if(dp[size] != -1) return dp[size];
        
        
        dp[size] = (int)(( (long)recur(size - 1) * 3 + recur(size - 2) - recur(size - 3) + MOD) % MOD);
        
        return dp[size];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        if(input == null) return;
        
        n = Integer.parseInt(input);
        Arrays.fill(dp, -1);
        System.out.println(recur(n));
    }
}
