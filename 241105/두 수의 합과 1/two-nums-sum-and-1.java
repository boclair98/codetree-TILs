import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int total = n + m;
        String num = Integer.toString(total);
        int count = 0 ;

        for (int i = 0 ; i<num.length(); i++){
            if (num.charAt(i)=='1'){
                count++;
            }
        }
        System.out.print(count);
    }
}