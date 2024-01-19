import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] asok = new int[1001];
        int[] bsok = new int[1001];
        int cnt = 0;
        int now = 0;
        int cnt2= 0;
        int now2= 0;
        for(int i = 1; i<=n ; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            for(int j = now ; j<now + b; j++){
                cnt = cnt + a;
                asok[j] = cnt;
                
            }
            now = now + b;

        }

        for(int i = 1; i<=m ; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            for(int j = now2 ; j<now2 + b; j++){
                cnt2 = cnt2 + a;
                bsok[j] = cnt2;
                
            }
            now2 = now2 + b;

        }
        int leader = 0;
        int cntall = 0 ;
        for(int i = 0 ;i<1000; i++){
            if (asok[i]>bsok[i]){
                if(leader==2){
                    cntall++;
                }
                
                leader = 1;
            }
                
            else if(asok[i]<bsok[i]){
                if(leader == 1){
                    cntall++;
                }
                leader = 2;
            }
            
        }
        System.out.print(cntall);
    }
}