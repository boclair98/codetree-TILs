import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] num1 = new int[101];
        int[] num2 = new int[101];

        for(int i = 0; i<n; i++){
            num1[i] = sc.nextInt();
        }

        for(int i = 0; i<m; i++){
            num2[i] = sc.nextInt();
        }
        int tot = 0;
        for(int i =0; i<=n-m;i++){
            int cnt = 0;
            for(int j = 0; j<m; j++){
                if (num1[i]==num2[j] || num1[i+1]==num2[j] || num1[i+2]==num2[j]){
                    cnt++;
                }
            }
            if (cnt == m){
                tot++;
            }
            
        }
        System.out.println(tot);
        
    }
}