import java.util.Scanner;
public class Main {
    public static int m1,d1,m2,d2;
    
    public static int month(int x, int y){
        int [] day = new int []{0,31,28,31,30,31,30,31,31,30,31,30,31};
        int tal = 0 ;

        for (int i = 1; i<x; i++){
            tal+=day[i];
        }
        tal+=y;
        return tal;
    } 
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        m1 = sc.nextInt();
        d1 = sc.nextInt();
        m2 = sc.nextInt();
        d2 = sc.nextInt();
        int diff = month(m2,d2) - month(m1,d1) + 1;
        while(diff<0){
            diff+=7;
        }
        String[] date = new String[]{"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
        System.out.print(date[diff%7]);
        

    }
}