import java.util.Scanner;
public class Main {
    public static void number(int n ){
        if (n == 0){
            return ;
        }
        number(n-1);
        System.out.print(n+" ");
    }

    public static void numberre(int n ){
        if (n == 0 ){
            return ;
        }
        System.out.print(n+" ");
        numberre(n-1);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        number(n);
        System.out.println();
        numberre(n);
    }
}