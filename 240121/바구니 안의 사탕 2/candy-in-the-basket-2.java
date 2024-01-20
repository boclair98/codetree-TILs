import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] candy = new int[202];

        for(int i = 0 ; i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            candy[b] += a;
        }
        int ans = 0;
        for(int i =0 ; i<=100; i++){
            int tal = 0;
            for(int j = i-k; j<= k+i; j++){
                if(j>=0 && j<=100){
                    tal += candy[j];
                }
            }
            ans = Math.max(tal,ans);
            
        }
        System.out.print(ans);

        



    }
}