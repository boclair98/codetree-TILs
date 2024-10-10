import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int cnt = 1;
        for(int i = n-1; i>=0; i--){
            if ((n-i)%2 == 1 ){
                for(int j = n-1; j>=0; j--){
                    arr[j][i] = cnt++;
                }
            }else{
                for(int j = 0 ; j<n; j++){
                    arr[j][i] = cnt++;
                }
            }
        }
        for(int i = 0 ; i<n; i++){
            for(int j = 0 ; j<n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}