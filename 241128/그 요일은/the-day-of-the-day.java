import java.util.*;
public class Main {
    private static int m1,d1,m2,d2,cnt;
    private static String day;
    private static int[] arr = new int[]{0,31,29,31,30,31,30,31,31,30,31,30,31};
    private static String[] days = new String[]{"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        m1 = sc.nextInt();
        d1 = sc.nextInt();
        m2 = sc.nextInt();
        d2 = sc.nextInt(); 
        day = sc.next();
        int idx = 0;

        while(true){
            if(m1 == m2 && d1 == d2){
                break;
            }
            d1++;
            idx++;
            if(idx > 6){
                idx = 0;
            }
            if(d1 > arr[m1]){
                m1 ++;
                d1 = 1;
            }
            if(days[idx] == day){
                cnt++;
            }
            
        }
        System.out.println(cnt);
    }
}