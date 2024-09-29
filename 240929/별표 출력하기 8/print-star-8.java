import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            if(i%2 == 1){
                System.out.println("*");
            }else{
                for(int j = 1; j<=2*i; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}