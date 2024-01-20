import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] num = new int[10001];
        char[] word = new char[10001];

        for(int i = 1; i<=n ; i++){
            int number = sc.nextInt();
            char ans = sc.next().charAt(0);

            word[number] = ans;
            
        }
        int ans = -1000000;
        for(int i = 0; i<100001; i++){
            int tal = 0;
            for(int j = i; j<=i+m; j++){
                if(word[j]=='G'){
                    tal = tal + 1;
                }
                if(word[j]=='H'){
                    tal = tal + 2;
                }
            }
            ans = Math.max(ans,tal);
        }
        System.out.print(ans);
    }
}