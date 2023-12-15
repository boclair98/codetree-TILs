import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int a = 1; a<=n; a++){
            for(int b = 1; b<=n; b++){
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();
        
        for(int c = 1; c<=n; c++){
            for(int d = 1; d<=n; d++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}