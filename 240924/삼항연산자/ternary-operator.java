import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s = a>=100 ? "pass":"failure";
        System.out.print(s);
    }
}