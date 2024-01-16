import java.util.Scanner;
public class Main {
    public static int mon(int x, int y){
        int[] day = new int[]{0,31,29,31,30,31,30,31,31,30,31,30,31};
        int tal = 0 ;
        for (int i = 1; i<x; i++){
            tal +=day[i];
        }
        tal = tal+y;
        return tal;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String word = sc.next();
        int diff = mon(m2,d2) - mon(m1,d1)+1;
        int cnt = 0 ;
        String[] day2 = new String[]{"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
        for (int i = 0 ; i<diff; i++){
            if (day2[i%7].equals(word)){
                cnt++;
            }
        } 
        System.out.print(cnt);
    }
}