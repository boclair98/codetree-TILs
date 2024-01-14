import java.util.Scanner;
public class Main {
    public static int add(int num){
        if (num<10){
            return num;
        }
        int tal = num %10;

        return tal+ add(num/10);

    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print(add(a*c*b));
    }
}