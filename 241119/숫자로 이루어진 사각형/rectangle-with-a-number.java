import java.util.Scanner;
public class Main {
    public static void squaer(int num){
        int cnt = 1;

        for(int i = 0 ; i<num; i++){
            for(int j = 0 ; j<num; j++){
                System.out.print(cnt+" ");
                cnt++;
                if (cnt==10){
                    cnt = 1;
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        squaer(n);
    }
}