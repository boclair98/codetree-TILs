import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] num = new int[1001];
        int[] num2 = new int[1001];
        int cur = 0;
        int cur2 = 0;
        int cnt = 0 ;
        int cnt2 = 0;
        for(int i = 0; i<n; i++){
            char word = sc.next().charAt(0);
            int count = sc.nextInt();

            if (word == 'R'){
                for(int j = cur; j<cur+count; j++){
                    cnt+=1;
                    num[j] = cnt;
                    
                }
                cur = count+cur;
            }
            if (word == 'L'){
                
                for(int j = cur; j<cur+count; j++){
                    cnt = cnt - 1;
                    num2[j] = cnt;
                }
                cur = cur+count;
            }
        }


        for(int i = 0; i<m; i++){
            char word = sc.next().charAt(0);
            int count = sc.nextInt();

            if (word == 'R'){
                for(int j = cur2; j<cur2+count; j++){
                    cnt2+=1;
                    num2[j] = cnt2;
                    
                }
                cur2 = count+cur2;
            }
            if (word == 'L'){
                
                for(int j = cur2; j<cur2+count; j++){
                    cnt2 = cnt2 - 1;
                    num2[j] = cnt2;
                }
                cur2 = cur2+count;
            }
        }
        int ans = - 1;
        for(int i = 0 ; i<101; i++){
            if(num[i]==num2[i]){
                ans = i ;
                break;
            }
        }
        System.out.print(ans);
    
}
}