import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int k = 1 ; k<=i; k++){
                System.out.print(i*k+" ");
            }
            System.out.println();
        }
    }
}