import java.util.Scanner;
public class Main {
    public static int numnum(int num){
        if (num<10){
            return num * num ;
        }
        int tal = num % 10 ;
        return tal * tal + numnum(num / 10);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(numnum(n));
    }
}