import java.util.Scanner;
public class Main {
    public static int fibonaci(int num){
        if (num == 1){
            return 1;
        }
        if (num == 2){
            return 1;
        }

        return fibonaci(num-1) + fibonaci(num-2);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(fibonaci(n));
    }
}