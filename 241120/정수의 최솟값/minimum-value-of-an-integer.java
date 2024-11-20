import java.util.Scanner;
public class Main {

    public static int min(int a,int b, int c){
        if ( a < b && a < c){
            return a;
        } else if( b < a && b < c){
            return b;
        }
        return c;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print(min(a,b,c));


    }
}