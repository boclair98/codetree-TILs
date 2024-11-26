import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sums(n));
    }
    public static int sums(int number){
        if(number == 1){
            return 0;
        }
        if(number % 2 == 1){
            return sums(number*3 + 1) + 1;
        }else{
            return sums(number/2) + 1;
        }
    }
}