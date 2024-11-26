import java.util.*;
public class Main {
    private static int a,b,c,total;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        total = a * b * c;
        System.out.print(sum(total));
        
    }
    public static int sum(int number){
        if (number< 10 ){
            return number ;
        }
        return sum(number / 10) + (number % 10);
    }
}