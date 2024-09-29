import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){

            for(int s = 1; s<=n-i; s++ ){
                System.out.print(" ");
            }
            for(int k = 0; k<i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int k = 1; k<=n-1; k++){
            for(int s = 0; s<k; s++){
                System.out.print("  ");
            }
            for(int j = 0; j<=(2*k)-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}