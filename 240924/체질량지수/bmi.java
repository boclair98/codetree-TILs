import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int cm = sc.nextInt();
        int weight = sc.nextInt();

        int b = (10000*weight) / (cm*cm);

        if (b>=25){
            System.out.println(b);
            System.out.println("Obesity");
        }else{
            System.out.println(b);
        }
    }
}