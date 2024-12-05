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
        int idx_a = 1;
        int idx_b = 1;
        for(int s = 0; s<n; s++){
            int count = sc.nextInt();
            char alpha = sc.next().charAt(0);
            while(count-- > 0){
                if(alpha == 'R'){
                    a[idx_a] = a[idx_a-1] + 1 ;
                }else{
                    a[idx_a] = a[idx_a-1] - 1 ;
                }
                idx_a++;
            }
        }

        for(int s = 0; s<m; s++){
            int count = sc.nextInt();
            char alpha = sc.next().charAt(0);
            while(count-- > 0){
                if(alpha == 'R'){
                    b[idx_b] = b[idx_b-1] + 1 ;
                }else{
                    b[idx_b] = b[idx_b-1] - 1 ;
                }
                idx_b++;
            }
        }
        for(int i = 0; i<Math.max(idx_b,idx_a); i++){
            // System.out.println(a[i]+" "+b[i]);
            if(a[i] != b[i]){
                if(a[i-1] ==b[i-1]){
                    total++;
                }
            }
        }
        System.out.println(total );

    }
}