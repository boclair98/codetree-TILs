import java.util.*;
public class Main {
    public static int[][] paper = new int[201][201];
    public static int size,total;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int now = 100;
        for(int s = 0; s<n; s++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();

            for(int i = now+x1; i<x1+now+8; i++){
                for(int j = now+y1; j<y1+now+8; j++){
                    paper[i][j] ++;
                }
            }
        }

        for(int i = 0; i<201; i++){
            for(int j =0; j<201; j++){
                if(paper[i][j] > 0){
                    total++;
                }
            }
        }
        System.out.println(total);
    }
}