import java.util.*;
class solve{
    String code;
    char color;
    int second;
    solve(String code,char color, int second){
        this.code = code;
        this.color = color;
        this.second = second;
    }
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String code = sc.next();
        char color = sc.next().charAt(0);
        int second = sc.nextInt();
        solve first = new solve(code,color,second);
        System.out.println("code : "+first.code);
        System.out.println("color : "+first.color);
        System.out.println("second : "+first.second);

    }
}