import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (n>=90 && m>=95){
            System.out.println(100000);
        }
        else if (n>=90 && m>=90){
            System.out.println(50000);
        }
        else if (n>=90 && m<90){
            System.out.println(0);
        }

        if (n<90){
            System.out.println(0);
        }
    }
}