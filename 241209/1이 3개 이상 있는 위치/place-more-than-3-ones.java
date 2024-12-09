import java.util.*;
public class Main {
    public static int n,total;
    public static int[][] number;
    public static int[] dx = new int[]{1,0,-1,0};
    public static int[] dy = new int[]{0,1,0,-1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        number = new int[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                number[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                int tal = dfs(i,j);
                if(tal>=3){
                    total++;
                }
            }
        }
        System.out.println(total);
    }

    public static int dfs(int x, int y){
        int cnt = 0 ;
        for(int i = 0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(0<=nx && n>nx && 0<=ny && n>ny){
                if(number[nx][ny] == 1){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}