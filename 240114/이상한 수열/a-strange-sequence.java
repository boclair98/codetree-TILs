import java.util.Scanner;
public class Main {
    public static int suyeol(int num){
        if (num==1){
            return 1;
        }
        if (num==2){
            return 2;
        }
        return suyeol(num/3) + suyeol(num-1);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(suyeol(n));
    }
}