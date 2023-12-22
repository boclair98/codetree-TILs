import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 2;
        for(int i = 1; i<=n; i++){

            for(int x = 1; x<=n; x++){

                System.out.print(k+" ");
                k++;
                k++;
                if (k>9){
                    k = 2;
                }

            }
            System.out.println();

        }
    }
}