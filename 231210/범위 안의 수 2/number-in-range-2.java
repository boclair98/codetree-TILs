import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int tal = 0;
        double tal2 = 0;

        for (int i = 1; i<=10; i++){
            int n = sc.nextInt();
            if(n>=0 && n<=200){
                tal = tal + n;
                cnt++;
            }
        }
        tal2 = (double) tal/cnt;
        System.out.printf("%d %.1f",tal,tal2);
    }
}