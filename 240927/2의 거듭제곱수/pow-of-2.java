import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = 2;
        int cnt = 1;
        while (true){
            if(start ==n){
                break;
            }
            start*=2;
            cnt++;
        }
        System.out.print(cnt);
    }
}