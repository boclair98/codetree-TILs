import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n; i>=1; i--){
            for(int k = 0 ; k<(n-i); k++){
                System.out.print("  ");
            }
            for(int j = 0 ; j<i; j++){
                System.out.print(i-j+" ");
            }
            System.out.println();
        }
    }
}