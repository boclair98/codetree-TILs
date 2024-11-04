import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String num = Integer.toString(n);

        int total = 0 ;

        for(int i = 0 ; i<num.length(); i++){
            total+= Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        System.out.print(total);
    }
}