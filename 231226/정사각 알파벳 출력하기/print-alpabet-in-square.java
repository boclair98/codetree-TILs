import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 65;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                System.out.print((char)k);
                k++;
            }
            System.out.println();
        }
    }
}