import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String num1 = Integer.toString(num);

        int tal = 0 ;
        for(int i = 0; i<num1.length(); i++){
            tal = tal+ (num1.charAt(i)-'0');
        }
        System.out.print(tal);
    }
}