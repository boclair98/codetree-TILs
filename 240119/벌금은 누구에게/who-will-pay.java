import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] num = new int[n+1];
        int cnt1 = 1;
        
        int ans = -1;
        
        for(int i = 0 ; i<m; i++){
            int count = sc.nextInt();
            num[count] = num[count]+1;
            if(num[count]>=k){
                ans = count;
                break;
            }    
        }
        System.out.print(ans);
        
    }
}