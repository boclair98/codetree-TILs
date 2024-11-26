import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sqart(n));
    }
    public static int sqart(int count){
        if(count<10){
            return count * count;
        }
        return sqart(count/10) + (count%10) * (count%10);
    }
}