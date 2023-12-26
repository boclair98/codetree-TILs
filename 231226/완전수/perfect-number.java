import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int cnt = 0;

        for(int i = n; i<=m; i++){
            int tal = 0;
            for(int k = 1 ; k<i; k++){
                if( i%k ==0){
                    tal = tal + k;
                }
            }
            if (tal == i ){
                cnt++;
            }
        
        
    }
    System.out.print(cnt);
}
}