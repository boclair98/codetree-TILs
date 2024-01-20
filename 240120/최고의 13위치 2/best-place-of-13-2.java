import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0 ; i<n; i++){
            for(int j = 0 ; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int ans = -100000000;
        for(int i =0; i<n; i++){
            for(int j = 0; j < n-2; j++){
                for(int k = 0 ; k<n; k++){
                    for(int l = 0; l<n-2; l++){
                        if(i==k && Math.abs(j-l)<=2){
                            continue;
                        }
                        int cnt1 = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
                        int cnt2 = arr[k][l] + arr[k][l + 1] + arr[k][l + 2];
                        ans = Math.max(ans,cnt1+cnt2);

                    }
                }
            }
        }
        
        System.out.print(ans);
    }
}