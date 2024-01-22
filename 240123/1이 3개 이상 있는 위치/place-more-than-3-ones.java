import java.util.Scanner;
public class Main {
        public static int[] xd= new int[]{1,0,-1,0};
        public static int[] yd = new int[]{0,-1,0,1};
        public static int n;
        public static int[][] arr = new int[100][100];

        public static boolean intrange(int x ,int y){

            return 0<=x && x<n && 0<=y && y<n;
        }
    public static int dfs(int x, int y){
        int tal = 0 ;

        for(int i = 0 ; i<4; i++){
            int dx=x+xd[i], dy=y+yd[i];
            if(intrange(dx,dy) && arr[dx][dy]==1){
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

        xd = new int[]{1,0,-1,0};
        yd= new int[]{0,-1,0,1};

        int cnt = 0;
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