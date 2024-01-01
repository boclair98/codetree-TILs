import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 여기에 코드를 작성해주세요.
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        int[][] arr2 = new int[n][m];
        int[][] total = new int[n][m];

        for(int i = 0 ; i<n; i++){
            for(int j = 0 ; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0 ; i<n; i++){
            for(int j = 0 ; j<m; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        for(int i = 0 ; i<n; i++){
            for(int j = 0 ; j<m; j++){
                if ( arr[i][j]==arr2[i][j]){
                    total[i][j] = 0;
                }
                else{
                    total[i][j] = 1;
                }
            }
        }

        for(int i = 0 ; i<n; i++){
            for(int j = 0 ; j<m; j++){
                System.out.print(total[i][j]+" ");
            }
            System.out.println();
        }
    }
}