import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(n/b+".");
        n = n % b;
        for (int i = 0 ; i < 20; i++){
            n = n * 10;
            System.out.print(n/b);
            n = n % b;
        }
    }
}