import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 3 == 0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        if (n%5 == 0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}