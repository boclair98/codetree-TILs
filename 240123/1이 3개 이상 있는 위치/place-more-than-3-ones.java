import java.util.Scanner;
public class Main {
    public static int n;
    public static int[][] arr = new int[101][101];
    public static int[] x_s = new int[]{1,0,-1,0};
    public static int[] y_s = new int[]{0,-1,0,1};

    public static boolean inrange(int x, int y){
        return x>=0 && x<n && y>=0 && y<n;
    }

    public static int dfs(int x, int y){
        int tal = 0 ;
        for(int i = 0 ; i<4; i++){
            int nx = x+x_s[i] , ny = y+y_s[i];
            if (inrange(nx,ny) && arr[nx][ny]==1){
                tal++;
            }
        }
        return tal;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 0 ; i<n; i++){
            for(int j = 0 ; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int cnt = 0 ;
        for(int i = 0 ; i<n; i++){
            for(int j = 0 ; j<n; j++){
                if(dfs(i,j)>=3){
                    cnt++;
                }
            }
        }
        System.out.print(cnt);


    }
}