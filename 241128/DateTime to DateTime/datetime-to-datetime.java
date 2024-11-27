import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int total = 11*24*60 + 11 * 60 + 11;
        int total2 = a*24*60 + b*60 + c;
        if((total) < (total2)){
            System.out.println(total2-total);
        }else{
            System.out.println(-1);
        }
    }
}