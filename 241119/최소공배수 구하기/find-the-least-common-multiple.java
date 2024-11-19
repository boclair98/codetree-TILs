import java.util.Scanner;
public class Main {
    public static int gcm(int num1, int num2){
        
        int cnt = 0 ;

        for(int i = Math.min(num1,num2); i>0; i--){
            if (num1%i == 0 && num2%i == 0){
                cnt = i;
                break;
            }
        }
        return cnt;
    }

    public static void gcd(int num1,int num2){
        int cnt = gcm(num1,num2);
        // System.out.print(cnt);
        int total = num1 / cnt * num2 / cnt * cnt;
        System.out.println(total);
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        gcd(n,m);
    }
}