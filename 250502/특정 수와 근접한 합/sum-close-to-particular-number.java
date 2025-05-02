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
        visited = new boolean[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        DFS(0,0);
        System.out.println(total);
    }

    private static void DFS(int idx,int start) {
        if(idx == n-2){
            int sum = 0;
            for (Integer ss : list) {
                sum+=ss;
            }
            total = Math.min(total,sum-s);
            return;
        }
        for(int i = start; i<n; i++){
            if(!visited[i]){
                visited[i] = true;
                list.add(arr[i]);
                DFS(idx+1,i+1);
                visited[i] = false;
                list.remove(list.size()-1);
            }
        }
    }


}
