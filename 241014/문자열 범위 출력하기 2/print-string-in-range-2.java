import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        for(int i = s.length()-1; i>s.length()-1-n; i--){
            System.out.print(s.charAt(i));
        }





    }
}