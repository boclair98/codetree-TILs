import java.util.*;
public class Main {
    public static int n,m,x,y;
    public static int[][] num;
    public static boolean [][] visited;
    public static int[] dx = new int[]{1,0,-1,0};
    public static int[] dy = new int[]{0,-1,0,1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        num = new int[n][m];
        visited = new boolean[n][m];

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                num[i][j] = sc.nextInt();
            }
        }
        int idx = 1;
        int alpha = 0;
        visited[0][0] = true;
        num[0][0] = idx;
        while (idx<=n*m){
            int nx = x + dx[alpha];
            int ny = y + dy[alpha];
            if(num[nx][ny] == 0 ){
                num[nx][ny] = idx + 1;
                idx++;
            }else{
                alpha = (alpha + 1) * 4;
            }

        }
        
    }
}