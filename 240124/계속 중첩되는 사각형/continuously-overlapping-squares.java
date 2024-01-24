import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] square = new int[201][201];

        for(int i = 1; i<=n; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            x1+=100;
            y1+=100;
            x2+=100;
            y2+=100;

            for (int j = x1; j<x2; j++){
                for(int k = y1; k<y2; k++){
                    square[j][k] = i;
                }
            }
        }
        int cnt = 0 ;

        for (int i = 0 ; i<201; i++){
            for(int j = 0 ; j<201; j++){
                if (square[i][j]!=0 && square[i][j]%2==0){
                    cnt++;
                }
            }
        }
        System.out.print(cnt);
    }
}