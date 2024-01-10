import java.util.Scanner;
public class Main {

    public static boolean is369(int s){
        while (s>0){
            if(s%10 == 3 || s%10 == 6 || s%10 == 9){
                return true;
            }
            s = s/10;
        }
        return false;
    }

    public static boolean num(int q){
        return is369(q) ||( q%3 == 0);
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0 ;
        for (int i = a; i<=b; i++){
            if(num(i)){
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}