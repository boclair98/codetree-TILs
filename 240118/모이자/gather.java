import java.util.Scanner;
public class Main {
    public static final int INT_MAX = Integer.MAX_VALUE;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] num = new int[n];

        for(int i = 0 ; i<n; i++){
            num[i] = sc.nextInt();
        }
        int ans = INT_MAX;

        for(int i = 0 ; i<n; i++){
            int sum = 0;
            for(int j = 0 ; j<n; j++){
                sum =sum+ num[j] * Math.abs(j-i);
            }
            ans = Math.min(sum,ans);
        }
        System.out.print(ans);


    }
}