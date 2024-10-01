import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int total = 0;
        for(int i = 0 ; i<10; i++){
            total+=sc.nextInt();
        }
        System.out.print(total);
    }
}