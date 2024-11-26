import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(fibo(n));
    }
    public static int fibo(int count){
        if(count == 1 || count == 2){
            return 1;
        }
        return fibo(count-1) + fibo(count-2);
    }
}