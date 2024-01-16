import java.util.Scanner;
public class Main {
    public static int day(int x, int y){
        int[] day =new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};
        int tal = 0;

        for(int i =1; i<x; i++){
            tal+=day[i];
        }
        tal+=y;
        return tal;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a,b,c,d;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        int cnt = 0 ;
        
        int val = day(c, d) - day(a, b) + 1;
        System.out.print(val);
    }
}