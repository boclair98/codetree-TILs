import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0 ;
        for(int i = 0 ; i<n; i++){
            int total = 0 ;
            for(int j = 0 ; j<4; j++){
                total+=sc.nextInt();
            }
            double avg = (double) total / 4;

            if(avg>=60){
                System.out.println("pass");
                cnt++;
            }else{
                System.out.println("fail");
            }

        }
        System.out.print(cnt);
    }
}