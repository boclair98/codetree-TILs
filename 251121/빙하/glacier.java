import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static StringTokenizer st;
    static int n,m;
    static int[] dx = {1,0,-1,0};
    static int[][] map;
    static List<Integer> counts = new ArrayList<>();
    static List<int[]> dis = new ArrayList<>();
    static boolean[][] visited;
    static int[] dy = {0,1,0,-1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        for(int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<m; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int time = 0;
        while(true){
            if(check()){
                break;
            }
            time++;
            counts.add(count());
            bfs();
        }
        System.out.println(time+" "+counts.get(counts.size()-1));
    }
    static void bfs(){
        visited = new boolean[n][m];
        Deque<int[]> dq = new ArrayDeque<>();
        dq.add(new int[]{0,0});
        visited[0][0] = true;
        while(!dq.isEmpty()){
            int[] cur = dq.poll();
            int x = cur[0];
            int y = cur[1];
            for(int i = 0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx<0 || nx>=n || ny<0 || ny>=m) continue;
                if(map[nx][ny] == 0 && !visited[nx][ny]){
                    visited[nx][ny] = true;
                    dq.add(new int[]{nx,ny});
                }
                if(map[nx][ny] == 1 && !visited[nx][ny]){
                    visited[nx][ny] = true;
                    dis.add(new int[]{nx,ny});
                }
            }
        }

        for(int[] now : dis){
            map[now[0]][now[1]] = 0;
        }
    }
    static int count(){
        int cnt = 0;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(map[i][j] == 1) cnt++;
            }
        }
        return cnt;
    }

    static boolean check(){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(map[i][j] == 1) return false;
            }
        }
        return true;
    }
}
