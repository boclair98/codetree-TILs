import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tal = 0;
        double tal2 = 0;

        for (int i = 1; i<=n; i++){
            int a = sc.nextInt();
            tal = tal +a;
        }
        tal2 = (double)tal/n;

        System.out.printf("%d %.1f",tal,tal2);

    }
}