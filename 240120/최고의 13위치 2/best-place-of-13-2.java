import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();

        int[][] num = new int[n][n];

        for (int i = 0 ; i<n; i++){
            for(int j = 0 ; j<n; j++){
                num[i][j] = sc.nextInt();
            }
        }
        int ans = -100000000;
        for(int i = 0; i<n-1; i++){
            int tal = 0;
            for(int j = 0 ; j<n-2; j++){
                tal = num[i][j]+num[i][j+1]+num[i][j+2]+num[i+1][j] + num[i+1][j+1]+num[i+1][j+2];
            }
            ans = Math.max(tal,ans);   
        }
        System.out.print(ans);
    }
}