import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            if(i%2==1){
                System.out.println("*");
            }
            else{
                for(int k = 1; k<=i; k++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}