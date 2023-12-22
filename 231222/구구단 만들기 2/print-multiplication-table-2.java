import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = 2; i<=8; i+=2){
            for(int j = m; j>=n; j--){
                System.out.print(j+" * "+i+" = "+j*i);
                if (j!=n){
                    System.out.print(" / ");
                }
            }
            System.out.println();
        }
    }
}