import java.util.Scanner;
public class Main {
    public static int value(int num){
        if (num==1){
            return 2;
        }
        if (num == 2){
            return 4;
        }

        return value(num-1) * value(num-2) % 100;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(value(n));
    }
}