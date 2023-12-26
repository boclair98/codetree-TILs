import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int cnt = 0 ;
        for(int i = n ; i<=m; i++){
            int tal = 0;
            for(int x = 1; x<=i; x++){
                if(i%x==0){
                    tal++;
                }
            }
            if(tal == 3){
                cnt++;
            }
        }
        System.out.print(cnt);


    }
}