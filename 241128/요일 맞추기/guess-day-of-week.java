import java.util.*;
public class Main {
    private static int[] day =new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};
    private static String[] days = new String[]{"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
    private static int m1,d1,m2,d2,idx;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m1 = sc.nextInt();
        d1 = sc.nextInt();
        m2 = sc.nextInt();
        d2 = sc.nextInt();

        if(m1 == m2){
            idx = 1;
            if(d1 > d2){
                while (true){
                    if(d1 == d2){
                        break;
                    }
                
                    if(d1<1){
                        m1--;
                        d1 = day[m1];
                    }
                    if(idx<0){
                        idx = 6; 
                    }
                    d1--;
                    idx--;
                }
            }
            System.out.println(days[idx]);
        }
        
    }
}