import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] num = new int[n];

        for(int i = 0; i<n; i++){
            num[i] = sc.nextInt();
        }
        int tal = 0;
        int ans = -1000;
        for(int i = 0; i<=n-k; i++){
            tal = num[i];
            for(int j = i+1; j<i+k; j++){
                tal+=num[j];
            }
            ans = Math.max(ans,tal);
        }
        System.out.print(ans);
    }
    
}