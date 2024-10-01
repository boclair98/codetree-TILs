import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =2; i<=n; i++){
            int total = 0 ;

            for(int j=1; j<=i; j++){
                if(i%j == 0){
                    total++;
                }
            }
            if (total == 2){
                System.out.print(i+" ");
            }
        }
    }
}