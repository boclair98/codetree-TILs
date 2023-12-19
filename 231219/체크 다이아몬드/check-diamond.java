import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){

            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }

            for(int k = 1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int t =0; t<n; t++){
            for(int x =0; x<=t; x++){
                System.out.print(" ");
            }

            for(int y =n-1; y>t; y--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}