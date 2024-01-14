import java.util.Scanner;
public class Main {
    public static int cnt = 0 ;
    public static int oneval(int num){
        if (num == 1){
            return cnt;
        }
        else if (num%2 == 0){
            cnt++;
            return oneval(num/2);
        }
        else if(num%2==1){
            cnt++;
            return oneval(num*3+1);
        }
        return 0;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(oneval(n));
    }
}