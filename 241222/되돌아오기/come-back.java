import java.io.*;
import java.nio.Buffer;
import java.util.*;

public class Main {
    private static  int x,y;
    private static int[][] number ;
    private static int[] dy =new int[]{1,0,-1,0};
    private static int[] dx = new int[]{0,1,0,-1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(br.readLine());
        int idx = 0 ;
        number = new int[200][200];
        x = 100;
        y = 100;
        number[x][y] = 0;
        boolean start = false;
        int cnt = 1;
        for(int i = 0; i<n; i++){
            String[] input = br.readLine().split(" ");
            char c = input[0].charAt(0);
            int num = Integer.parseInt(input[1]);
            if(start){
                break;
            }
            if(c == 'E'){
                idx = 0;
            }else if(c == 'S'){
                idx = 1;
            }else if(c == 'W'){
                idx = 2;
            }else{
                idx = 3;
            }
            for(int j = 0; j<num; j++){
                int nx = x + dx[idx];
                int ny = y + dy[idx];
                if(range(nx,ny)){
                    x = nx ;
                    y = ny ;
                    if(x == 100 && y == 100){
                        start = true;
                        number[x][y] = cnt++ ;
                        break;
                    }else{
                        number[x][y] = cnt++;}
                }
            }


    }   if(start) {
            System.out.println(number[100][100]);
        }
        else{
            System.out.println(-1);
        }

}
    private static boolean range(int nx, int ny){
        return 0<=nx && nx<200 && 0<=ny && ny<200;
    }
}