import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            for (int k = 0; k<n; k++){
                System.out.print(9+2*i+2*k+" ");
            }
            System.out.println();
        }
    }
}