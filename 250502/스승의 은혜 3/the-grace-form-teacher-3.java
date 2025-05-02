import java.io.*;
import java.util.*;

public class Main {
    static int n, s, total;
    static int[][] arr;

    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        arr = new int[n][3];
        for(int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = arr[i][0] + arr[i][1];
        }
        Arrays.sort(arr,(a,b) -> Integer.compare(a[2],b[2]));

        int count = 0;
        for(int i = 0; i<n; i++){
            int money = s - ((arr[i][0])/2) - (arr[i][1]);
//            System.out.println(money);
            count = 0;
            if(money < 0){
                continue;
            }
            count++;
            for(int j = 0; j<n; j++){
                if(i == j){
                    continue;
                }
                if(money - arr[j][0] - arr[j][1] >= 0){
                    money = money - arr[j][0] - arr[j][1];
                    count++;
                }
            }
//            System.out.println(count);
            total = Math.max(total,count);
        }
        System.out.println(total);

    }




}
