import java.util.*;
class human{
    String code;
    char point;
    int time;
    public human(String code, char point, int time){
        this.code = code;
        this.point = point;
        this.time = time;
    }
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        char p = sc.next().charAt(0);
        int t = sc.nextInt();
        human hu = new human(c,p,t);
        System.out.println("secret code : "+hu.code);
        System.out.println("meeting point : "+hu.point);
        System.out.println("time : "+hu.time);
        
    }
}