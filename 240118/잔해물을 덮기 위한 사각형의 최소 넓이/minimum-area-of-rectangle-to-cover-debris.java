import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[][] num = new int[2001][2001];
        int cnt = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        a+=1000;
        b+=1000;
        c+=1000;
        d+=1000;

        for(int j = a; j<c; j++){
            for(int k = b; k<d; k++){
                num[j][k] = 1;
            }
        }
        
        int z = sc.nextInt();
        int x = sc.nextInt();
        int v = sc.nextInt();
        int n = sc.nextInt();
        z+=1000;
        x+=1000;
        v+=1000;
        n+=1000;
        for(int j = z; j<v; j++){
            for(int k = x; k<n; k++){
                if(num[j][k]==1){
                    num[j][k] = 2;
                }
            }
        }

        for(int i = 0 ; i<2000; i++){
            for(int j = 0 ; j<2000; j++){
                if(num[i][j]>=1){
                    cnt++;
                }
            }
        }
        System.out.print(cnt);

    }
}