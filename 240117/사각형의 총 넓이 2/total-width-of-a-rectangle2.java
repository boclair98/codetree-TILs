import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] num = new int[201][201];
        int tal = 0;
        for(int i = 0 ; i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            for(int q = a; q<c; q++){
                for(int w = b; w<d; w++){
                    num[q][w]+=1;
                }
            }

            for(int q = a; q<c; q++){
                for(int w = b; w<d; w++){
                    if (num[q][w]==1){
                        tal++;
                    }
                }
            }
        }
        System.out.print(tal);
    }
}