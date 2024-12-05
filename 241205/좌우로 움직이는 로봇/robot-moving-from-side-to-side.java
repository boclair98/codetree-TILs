import java.util.*;
public class Main {
    public static int n,m,total,cnt,cnt2;
    public static int[] a;
    public static int[] b;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        a = new int[2000001];
        b = new int[2000001];
        int now = 1000000;
        for(int s = 0 ; s<n; s++){
            int number = sc.nextInt();
            char word = sc.next().charAt(0);
            if(word =='R'){
                for(int i = now ; i<now+number; i++){
                    a[i] = cnt ;
                    cnt++;
                }
                now = now + number;
            }else{
                for(int i = now; i<now+number; i++){
                    a[i] = cnt;
                    cnt--;
                }
                now = now + number;
            }
        }

        int now2 = 1000000;
        for(int s = 0 ; s<m; s++){
            int number = sc.nextInt();
            char word = sc.next().charAt(0);
            if(word =='R'){
                for(int i = now2 ; i<now2+number; i++){
                    b[i] = cnt2 ;
                    cnt2++;
                }
                now2 = now2 + number;
            }else{
                for(int i = now2; i<now2+number; i++){
                    b[i] = cnt2;
                    cnt2--;
                }
                now2 = now2 + number;
            }
        }

        for(int i = 0; i<2000001; i++){
            if(a[i]!=0 && b[i]!=0){
                if(a[i] == b[i]){
                    total++;
                }
            }
        }
        System.out.println(total);

    }
}