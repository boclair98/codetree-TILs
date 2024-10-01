import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0 ; i<n; i++){
            int k = sc.nextInt();
            int cnt = 0 ;
            while (k!=1){
                if(k%2==0){
                    k = k / 2;
                    cnt++;
                }else{
                    k = (k*3)+1;
                    cnt++;
                }
            }
            System.out.println(cnt);
            
        }
    }
}