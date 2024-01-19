import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] num = new int[101];
        int cnt1 = 1;
        for(int i = 1; i<=n; i++){
            num[i] = cnt1;
            cnt1++;
        }

        for(int i = 0 ; i<m; i++){
            int now = sc.nextInt();
            num[now]+=1;
        }
        int ans = -1;
        for(int i = 1; i<=n; i++){
            if(num[i]>=k){
                ans = i;
                break;
            }
        }
        System.out.print(ans);

    }
}