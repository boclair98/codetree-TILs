import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.substring(1,s.length()) + s.substring(0,1);
        System.out.print(s);
    }
}