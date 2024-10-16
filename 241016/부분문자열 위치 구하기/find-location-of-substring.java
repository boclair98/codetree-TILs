import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String y = sc.next();
        if(s.contains(y)){
            System.out.print(s.indexOf(y));
        }else{
            System.out.print(-1);
        }
    }
}