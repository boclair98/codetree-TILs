import java.util.Scanner;
public class Main {
    public static void print(int num){
        for (int i = 0 ; i<num; i++){
            System.out.println("12345^&*()_");
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        print(n);
    }
}