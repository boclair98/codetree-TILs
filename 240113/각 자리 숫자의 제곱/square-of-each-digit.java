import java.util.Scanner;
public class Main {
    public static int add(int n ){
        if (n<10){
            return n * n;
        }
        int digit = n % 10;
        return add(n/10) + digit*digit;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(add(n));
    }
}