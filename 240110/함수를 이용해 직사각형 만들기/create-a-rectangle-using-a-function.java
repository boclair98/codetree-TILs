import java.util.Scanner;
public class Main {
    public static void one(int a, int b){
        for(int i = 0 ; i<a; i++){
            for(int j = 0 ; j<b; j++){
                System.out.print("1");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        one(n,m);
    }
}