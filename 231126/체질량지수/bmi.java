import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int tal = b * 100 *100 /(a*a); 

        if (tal>=25){
            System.out.println(tal);
            System.out.println("Obesity");
        }
        else{
            System.out.println(tal);
        }
    }
}