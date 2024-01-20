import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] candy = new int[101];

        for(int i = 0 ; i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            candy[b-1] = a;
        }
        int ans = 0;
        for(int i =k ; i<101-k; i++){
            int tal = 0;
            for(int j = i-k; j<= k+i; j++){
                tal += candy[j];
            }
            ans = Math.max(tal,ans);
            
        }
        System.out.print(ans);

        



    }
}