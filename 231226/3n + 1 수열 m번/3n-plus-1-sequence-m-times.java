import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int cnt = 0;
        for(int i = 1; i<=n; i++){
            while (true){
                if (k == 1){
                    break;
                }
                else if( k %2 == 0){
                    k = k/2;
                    cnt++;
                }
                else if(k%2==1){
                    k = k *3 + 1;
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}