import java.io.*;
import java.util.*;

public class Main {
    static int n,one,max_val ;
    static int[][] map;
    static StringTokenizer st ;
    static boolean[][] visited;
    static int[] dx1 ={-1,-2,1,2};
    static int[] dy1 ={0,0,0,0};
    static int[] dx2={-1,0,1,0};
    static int[] dy2={0,1,0,-1};
    static int[] dx3={-1,-1,1,1};
    static int[] dy3={-1,1,1,-1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        visited = new boolean[n][n];
        for(int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<n; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j] == 1){
                    one++;
                }
            }
        }
        DFS(0);
        System.out.println(max_val);

    }

    private static void DFS(int idx) {
        if(idx == one){
            int count = 0;
            // System.out.println();
            for(int i = 0; i<n; i++){
                for(int j = 0; j<n; j++){
//                    System.out.print(visited[i][j]);
                    if(visited[i][j]){
                        count++;
                    }
                }
//                System.out.println();
            }
            max_val = Math.max(max_val,count);
            return;
        }
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(!visited[i][j] && map[i][j] == 1){
                    visited[i][j] = true;
                    for(int k = 0; k<4; k++){
                        int nx = i+dx1[k];
                        int ny = j+dy1[k];
                        if(nx<0 || nx>=n || ny<0 || ny>=n) continue;
                        visited[nx][ny] = true;
                    }
                    DFS(idx+1);
                    for(int k = 0; k<4; k++){
                        int nx = i + dx1[k];
                        int ny = j + dy1[k];
                        if(nx<0 || nx>=n || ny<0 || ny>=n) continue;
                        visited[nx][ny] = false;
                    }

                    for(int k = 0; k<4; k++){
                        int nx = i+dx2[k];
                        int ny = j+dy2[k];
                        if(nx<0 || nx>=n || ny<0 || ny>=n) continue;
                        visited[nx][ny] = true;
                    }
                    DFS(idx+1);
                    for(int k = 0; k<4; k++){
                        int nx = i + dx2[k];
                        int ny = j + dy2[k];
                        if(nx<0 || nx>=n || ny<0 || ny>=n) continue;
                        visited[nx][ny] = false;
                    }
                    for(int k = 0; k<4; k++){
                        int nx = i+dx3[k];
                        int ny = j+dy3[k];
                        if(nx<0 || nx>=n || ny<0 || ny>=n) continue;
                        visited[nx][ny] = true;
                    }
                    DFS(idx+1);
                    for(int k = 0; k<4; k++){
                        int nx = i + dx3[k];
                        int ny = j + dy3[k];
                        if(nx<0 || nx>=n || ny<0 || ny>=n) continue;
                        visited[nx][ny] = false;
                    }
                    visited[i][j] = false;
                }
            }
        }
    }
}
