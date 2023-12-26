import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        for(int i = 1; i<=n; i++){
            int sum = 0;
            int arr[] = new int[4];

            for(int t = 0 ; t<4; t++){
                arr[t] = sc.nextInt();
            }

            for(int t = 0 ; t<4; t++){
                sum = sum+ arr[t];
            }
            int tal = sum/4;

            if (tal >=60){
                System.out.println("pass");
                cnt++;
            }
            else{
                System.out.println("fail");
            }

        }
        System.out.print(cnt);
    }
}