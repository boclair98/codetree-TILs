import java.util.Scanner;
public class Main {

    public static void gcd(int num1,int num2){
        for(int i = Math.min(num1,num2); i>=1; i--){
            if (num1 % i == 0 && num2 % i == 0){
                System.out.println(i);
                break;
            }
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        gcd(n,m);
    }
}