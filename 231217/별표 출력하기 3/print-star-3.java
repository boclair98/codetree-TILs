import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        for (int i = 0; i<n; i++){
            for(int k = 0; k<i; k++){
                System.out.print("  ");
            }

            for(int t = 0; t<(2*n)-(2*i)-1; t++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}