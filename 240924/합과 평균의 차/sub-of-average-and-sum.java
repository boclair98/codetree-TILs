import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int total = a+b+c;
        int avg = (a+b+c) / 3;
        int minus = total - avg;
        System.out.println(total);
        System.out.println(avg);
        System.out.println(minus);
    }
}