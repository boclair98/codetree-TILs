import java.util.Scanner;
public class Main {
    public static void gong(int a, int b){
        int cnt = a;
        while (true){
            if (cnt%b == 0){
                break;
            }
            cnt = cnt+a ;
        
        }
        System.out.print(cnt);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        gong(n,m);
    }
}