import java.util.*;
public class Main {
    public static int n,size,total;
    public static int[][] square = new int[201][201];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int q = 0; q<n; q++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            for(int i = x1; i<x2; i++){
                for(int j = y1; j<y2; j++){
                    square[i][j] = square[i][j] + 1;
                }
            }
        }

        for(int i = 0; i<201; i++){
            for(int j = 0; j<201; j++){
                if(square[i][j]>0){
                    total++;
                }
            }
        }
        System.out.print(total);
    }

}