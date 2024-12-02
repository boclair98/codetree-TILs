import java.util.*;
public class Main {
    static int[][] size = new int[2001][2001];
    static int total = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int now = 1000;
        for(int s = 0; s<2; s++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            for(int i = now + x1; i<now+x2; i++){
                for(int j = y1+now; j<now+y2; j++){
                    size[i][j]++;
                }
            }
        }
        int cx1 = sc.nextInt();
        int cy1 = sc.nextInt();
        int cx2 = sc.nextInt();
        int cy2 = sc.nextInt();
        for(int i = now+cx1; i< now+cx2; i++){
            for(int j = now+cy1; j<now+cy2; j++){
                size[i][j]--;
            }
        }
        for(int i = 0; i<2001; i++){
            for(int j=0;j<2001; j++){
                if(size[i][j] == 1){
                    total++;
                }
            }
        }
        System.out.println(total);
    }
}