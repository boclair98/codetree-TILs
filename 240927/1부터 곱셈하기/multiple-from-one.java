import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tal = 1;

        for(int i = 1; i<=10; i++){
            tal = tal * i;
            if(tal>=n){
                System.out.print(i);
                break;
            }
        }
    }
}