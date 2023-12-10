import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 여기에 코드를 작성해주세요.
        while (true){
            int n = sc.nextInt();
            if (n == 0){
                break;
            }
            System.out.println(n);
        }
    }
}