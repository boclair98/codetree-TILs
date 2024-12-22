import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static int[] dy = new int[]{0,1,0,-1};
    private static int[] dx = new int[]{-1,0,1,0};
    private static int idx, total,x,y;
    private static int[][] num ;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("");
        num = new int[100][100];
        num[50][50] = 0;
        int cnt = 1;
        x = 50;
        y = 50;
        boolean start = false;
        for(int i = 0; i<str.length; i++){
//            System.out.println(x+" "+y);
//            System.out.println(num[x][y]);
            if (start){
                break;
            }
            char c = str[i].charAt(0);
            if(c == 'R'){
                idx = (idx+1) % 4;
                cnt++;
            } else if(c == 'L'){
                idx = Math.abs((idx+3)) % 4;
                cnt++;
            }

            if (c == 'F'){
                int nx = x + dx[idx];
                int ny = y  +dy[idx];
                if (nx == 50 && ny == 50){
                    start = true;
                }
                if(range(nx,ny)){
                    num[nx][ny] = cnt++ ;
                    x = nx ;
                    y = ny;
                }
            }


        }
        int first = num[50][50];
        if(first == 0){
            System.out.println(-1);
        }else{
            System.out.println(first);
        }

    }

    private static boolean range(int nx, int ny){
        return 0<=nx && nx<100 && 0<=ny && ny<100;
    }
}