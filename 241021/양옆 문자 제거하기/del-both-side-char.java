import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.substring(0,2) + s.substring(3,s.length()-2)+s.substring(s.length()-1);
        System.out.println(s);
    }
}