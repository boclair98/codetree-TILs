import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        boolean state = false;
        if(n%3 ==0 && a%3==0 && b%3==0 && c % 3==0 && d% 3 ==0){
            state = true;
        }

        if(state == true){
            System.out.print(1);
        }else{
            System.out.print(0);
        }
    }
}