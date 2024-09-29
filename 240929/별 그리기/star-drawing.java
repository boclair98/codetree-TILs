import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            for(int s = 1; s<=(n-i); s++){
                System.out.print(" ");
            }
            for(int k=1; k<=(2*i-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i =n-1; i>=1; i--){
            for(int s =1; s<=n; s++){
                System.out.print(" ");
            }
            for(int k =1; k<=(2*n)-(2*i)-3; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}