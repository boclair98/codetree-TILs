import java.util.Scanner;
public class Main {
    public static void swap(int a, int b){
        int swap = a;
        a = b;
        b = swap;
        System.out.print(a+" "+b);
            }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        swap(n,m);

    }
}