import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int tal = 0 ;
        int cnt = 0;
        double tal2 = 0;
        while (true){
            int n = sc.nextInt();
            if (n>=20 && n<=29){
                tal = tal + n;
                cnt++;
            }
            else{
                break;
            }
        }
        tal2 = (double) tal/cnt;
        System.out.printf("%.2f",tal2);

    }
}