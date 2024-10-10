import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 여기에 코드를 작성해주세요.
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][n];

        for(int i = 0 ; i<m; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[x-1][y-1] = x*y;
        }
        for(int i = 0 ; i<n; i++){
            for(int j = 0 ; j<n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}