import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];

        for(int i = 0 ; i<n; i++){
            num[i] = sc.nextInt();
        }

        int cnt = 0 ;

        for(int i = 0 ; i<n; i++){
            for(int j = i+1; j<n; j++){
                for(int k = j+1; k<n; k++){
                    if (num[i]<=num[j] && num[j]<=num[k]){
                        cnt++;
                        
                    }
                }
            }
        }
        System.out.print(cnt);
    }
}