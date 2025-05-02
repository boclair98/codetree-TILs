import java.io.*;
import java.util.*;

public class Main {
    static int n, s, total;
    static int[] arr;
    static boolean[] visited;
    static StringTokenizer st;
    static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        total = Integer.MAX_VALUE;
        arr = new int[n];
        int num = 0;
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            num+=arr[i];
        }
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                for(int k = j+1; k<n; k++){
                    if(Math.abs(s-(num-arr[j]-arr[k])) < total){
                        total = Math.abs(s-(num-arr[j]-arr[k]));
                    }
                }
            }
        }
        System.out.println(total);
    }
    }



