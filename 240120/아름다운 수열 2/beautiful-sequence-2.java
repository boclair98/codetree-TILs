import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] num1 = new int[101];
        int[] num2 = new int[101];
        int[] tot = new int[101];
        int cnt = 0 ;
        for(int i = 0; i<n; i++){
            num1[i] = sc.nextInt();
        }

        for(int i = 0; i<m; i++){
            num2[i] = sc.nextInt();
        }
        Arrays.sort(num2,0,m);
        for(int i = 0 ; i<=n-m; i++){
            for(int j = 0; j<m; j++){
                tot[j] = num1[i+j];
            }
            Arrays.sort(tot,0,m);
            boolean now =true;

            for(int k = 0; k<m; k++){
                if(tot[k]!=num2[k]){
                    now =false;
                    break;
                }
            }

            if(now){
                cnt++;
            }

        }
        System.out.println(cnt);

        
        
        
    }
}