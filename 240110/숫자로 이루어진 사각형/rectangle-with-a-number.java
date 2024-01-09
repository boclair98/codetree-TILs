import java.util.Scanner;
public class Main {
    public static void cro(int a){
        int cnt = 1;
        for(int i = 0 ; i<a; i++){
            for (int j = 0 ; j<a; j++){
                if (cnt == 10){
                    cnt = 1;
                }
                System.out.print(cnt+" ");
                cnt++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        cro(n);
    }
}