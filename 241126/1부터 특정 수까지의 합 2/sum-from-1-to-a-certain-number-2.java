import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(sum(n));
    }
    public static int sum(int number){
        if(number == 1){
            return 1;
        }
        return number + sum(number-1);
    }
}