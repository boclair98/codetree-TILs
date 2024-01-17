import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[][] num = new int[2000][2000];
        int cnt = 0;
        int gal = 1;
        for (int i = 0 ; i<3; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            a+=1000;
            b+=1000;
            c+=1000;
            d+=1000;

            for(int q = a; q<c; q++){
                for (int w = b; w<d; w++){
                    num[q][w] = gal;
                }
            }
            gal++;
        }

        for(int i = 0 ; i<2000; i++){
            for(int j = 0 ; j<2000; j++){
                if (num[i][j]<3 && num[i][j]>0){
                    cnt++;
                }
            }
        }
        System.out.print(cnt);
    }
}