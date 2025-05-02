import java.io.*;
import java.util.*;

public class Main {
    static int n, s, total;
    static int[] arr1;
    static int[] arr2;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        arr1 = new int[n];
        arr2 = new int[n];
        for(int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            arr1[i] = Integer.parseInt(st.nextToken());
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i<n; i++){
            int count = 1;
            int cost = s;
            int cnt = 0;
            for(int j = i; j<n; j++){
                if(count > 0){
                    count--;
                    cost-=(arr1[j]/2);
                    cost-=arr2[j];
                    if(cost < 0){
                        break;
                    }else{
                        cnt++;
                    }
                }else{
                    cost-=arr1[j];
                    cost-=arr2[j];
                    if(cost<0){
                        break;
                    }else{
                        cnt++;
                    }
                }
//                System.out.println(cost);
            }
            total = Math.max(total,cnt);

        }
        System.out.println(total);
    }




}
