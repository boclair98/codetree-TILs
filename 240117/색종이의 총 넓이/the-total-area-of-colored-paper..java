import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] num = new int[800][800];
        int gijoon = 0 ;
        for(int i = 0 ; i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            a= a+400;
            b =b+400;
            int tal = a + 8;
            int val = b + 8;

            for(int j = a; j<tal; j++){
                for(int k = b; k<val; k++){
                    if (num[j][k] == gijoon){
                        num[j][k] += 1;
                    }
                }
            }
            gijoon++;


            
        }
        int cnt = 0;
        for(int i = 0; i<800; i++){
            for (int j = 0 ; j<800; j++){
                if(num[i][j]==3){
                    cnt++;
                }
            }
        }
        System.out.print(cnt * 8);
    }
}