import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int cnt = 11;
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                System.out.print((i*2)+(j*2)+11+" ");
            }
            System.out.println();
        }
    }
}