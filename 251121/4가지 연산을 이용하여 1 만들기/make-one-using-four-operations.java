import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static int n;
    static Deque<int[]> dq = new ArrayDeque<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        dq.add(new int[]{n,0});
        while(!dq.isEmpty()){
            int[] cur = dq.poll();
            int num = cur[0];
            int count = cur[1];
            if(num == 1){
                System.out.println(count);
                return;
            }
            dq.add(new int[]{num-1,count+1});
            dq.add(new int[]{num+1,count+1});
            if(num%2 == 0){
                dq.add(new int[]{num/2,count+1});
            }else if(num % 3 == 0){
                dq.add(new int[]{num/3,count+1});
            }

        }
    }
}
