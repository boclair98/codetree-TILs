import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            for(int t =0; t<n-i; t++ ){
                System.out.print(" ");
            }
            for(int k = 0; k<2*i -1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = n-1; i>=1; i--){
            
            for(int y = 0; y<n-i; y++){
                System.out.print(" ");
            }
            for(int x =0; x<(2*i-1); x++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}