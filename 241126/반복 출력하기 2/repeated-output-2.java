import java.util.Scanner;
public class Main {
    public static void recurion(int count){
        if (count == 0){
            return;
        }
        System.out.println("HelloWorld");
        recurion(count-1);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recurion(n);
    }
}