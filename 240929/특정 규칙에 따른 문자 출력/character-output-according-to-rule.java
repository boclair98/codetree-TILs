import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){

            for(int k = i; k<n; k++){
                System.out.print("  ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("@ ");
            }
            System.out.println();
        }

        for(int i = 1; i<=n-1; i++){

            for(int s=0; s<n-i; s++){
                System.out.print("@ ");
            }
            System.out.println();
        }
    }
}