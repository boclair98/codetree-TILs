import java.util.*;
public class Main {
    private static int[] day =new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};
    private static String[] days = new String[]{"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
    private static int m1,d1,m2,d2,idx;

    public static int calucion(int a, int b){
        int x = 1;
        int y = 1;
        int cnt = 0;
        while (true){
            if(a == x && b == y){
                break;
            }
            cnt++;
            y++;
            if(day[x]<y){
                x++;
                y = 1;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m1 = sc.nextInt();
        d1 = sc.nextInt();
        m2 = sc.nextInt();
        d2 = sc.nextInt();
        int idx = 1;
        int first = calucion(m1,d1);
        int second = calucion(m2,d2);
        if(first > second){
            int total = first - second;
            while (true){
                if(total == 0){
                    break;
                }
                total--;
                idx--;
                if(idx<0){
                    idx = 6;
                }
            }
            System.out.println(days[idx]);
        }else if (second>first){
            int total = second - first + idx;
            System.out.print(days[total%6]);
        }else{
            System.out.print(days[1]);
        }
        
    }
}