import java.util.*;
public class Main {
    private static int m1,d1,m2,d2;
    private static int[] day = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        m1 = sc.nextInt();
        d1 = sc.nextInt();
        m2 = sc.nextInt();
        d2 = sc.nextInt();
        int cnt = 1 ;
        while (true){
            if(m1 == m2 && d1 == d2){
                break;
            }
            cnt++;
            d1++;
            if(d1>day[m1]){
                d1 = 1;
                m1++;
            }
        }
        System.out.println(cnt);
        
    }
}