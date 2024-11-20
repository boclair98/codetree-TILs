import java.util.Scanner;
public class Main {
    private static void sum(int num1, int num2){
        if (num1 < num2){
            num1+=10;
            num2*=2;
        }else{
            num1*=2;
            num2+=10;
        }
        System.out.println(num1+" "+num2);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        sum(a,b);
    }
}