import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int start = 0;
        for(int i = 1; i<n; i++){
            if (n%i == 0){
                start+=i;
            }
        }
        if (start == n){
            System.out.print("P");
        }else{
            System.out.print("N");
        }
    }
}