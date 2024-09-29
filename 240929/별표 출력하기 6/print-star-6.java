import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = n ; i>=1; i--){
            
            for(int k = 0; k<n-i; k++){
                System.out.print("  ");
            }


            for(int j = 1; j<=(2*i-1); j++){
                System.out.print("* ");
            }
            System.out.println();
        }


        for(int i = 1; i<=n-1; i++){

            for(int j = i; j<n-1; j++){
                System.out.print("  ");
            }
            for(int k =0; k<(2*i+1); k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}