import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 여기에 코드를 작성해주세요.
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[100][100];
        int cnt = 0 ;

        for (int i = 0 ; i<m; i++){

            if (i%2==0){
                for (int q = 0 ; q<n; q++){
                    arr[q][i] =cnt;
                    cnt++;
                }
            }
            else{
                for(int w = n-1; w>=0; w--){
                    arr[w][i] = cnt;
                    cnt++;
                }
            }
        }

        for(int i = 0 ; i<n; i++){
            for(int j = 0 ; j<m; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}