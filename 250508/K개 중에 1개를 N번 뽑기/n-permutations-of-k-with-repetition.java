import java.io.*;
import java.util.*;

public class Main {
    static int k,n;
    static boolean[] visited;
    static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        k = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        visited = new boolean[k+1];
        DFS(0);
    }

    private static void DFS(int idx) {
        if(idx == n){
            for (Integer s : list) {
                System.out.print(s+" ");
            }
            System.out.println();
            return;
        }
        for(int i = 1; i<=k; i++){
            list.add(i);
            DFS(idx+1);
            list.remove(list.size()-1);
        }
    }

}
