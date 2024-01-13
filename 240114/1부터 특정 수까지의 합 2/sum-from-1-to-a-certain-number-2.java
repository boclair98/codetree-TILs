import java.util.Scanner;
public class Main {
    public static int printadd(int num){
        if ( num == 1){
            return 1;
        }
        return printadd(num-1) + num;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(printadd(n));
    }
}