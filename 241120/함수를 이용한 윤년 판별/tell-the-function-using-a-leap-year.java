import java.util.Scanner;
public class Main {

    public static boolean year(int num){
        if (num % 4 == 0){
            return true;
        } else if( num % 100 ==0 && num %400 == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        System.out.println(year(y));
    }
}