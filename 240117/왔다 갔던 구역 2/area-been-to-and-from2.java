import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[201];
        int cnt = 0 ;
        int cur = 100 ;
        int right = 0 ;
        int left = 0 ;
        for (int i = 0 ; i<n; i++){
            int x = sc.nextInt();
            char r = sc.next().charAt(0);

            if (r == 'R'){
                right = cur + x;
                left = cur;
                cur = right;
                
            }
            else if (r=='L'){
                right = cur ;
                left = cur-x;
                cur = left;
                
            }
            for(int j = left; j<right; j++){
                    num[j]++;
                }
        }

        for(int i = 0 ; i<201; i++){
            if (num[i]>=2){
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}