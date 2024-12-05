import java.util.*;
public class Main {
    public static int n,m,cnt,cnt2;
    public static int[] a = new int[200001];
    public static int[] b = new int[200001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int now = 100000;
        n = sc.nextInt();
        m = sc.nextInt();
        for(int s = 0; s<n; s++){
            char word = sc.next().charAt(0);
            int num = sc.nextInt();
            if(word == 'R'){
                for(int i = now; i<now+num; i++){
                    a[i] =cnt;
                    cnt++;
                }
                now = now + num  ;
            }else{
                for(int i = now; i<now+num; i++){
                    a[i] = cnt;
                    cnt--;
                }
                now = now + num  ;
            }
        }
        int now2 = 100000;
        for(int s = 0; s<m; s++){
            char word = sc.next().charAt(0);
            int num = sc.nextInt();
            if(word == 'R'){
                for(int i = now2; i<now2+num; i++){
                    b[i] =cnt2;
                    cnt2++;
                }
                now2 = now2 + num ;
            }else{
                for(int i = now2; i<now2+num; i++){
                    b[i] = cnt2;
                    cnt2--;
                }
                now2 = now2 + num ;
            }
        }
        boolean check = false;
        for(int i = 0; i<200001; i++){
            if(a[i]!=0 && b[i] != 0){
                if(a[i] == b[i]){
                    System.out.println(i-100000);
                    check = true;
                    break;
                }
            }
        }
        if(!check){
            System.out.println(-1);
        }

        // for(int i = 990; i< 1015; i++){
        //     System.out.println(a[i]+" "+b[i]);
        // }
        

    }
}