import java.util.*;
public class Main {
    public static int a,b,c,d;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        int cnt = 0;
        while (true){
            if(a == c && b == d){
                break;
            }
            cnt++;
            b++;
            if(b>=60){
                b = 0 ;
                a++;
            }
        }
        System.out.println(cnt);
    }
}