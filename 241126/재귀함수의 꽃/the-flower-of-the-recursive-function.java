import java.util.*;
public class Main {
    public static void numberPrint(int number){
        if(number == 0){
            return;
        }
        System.out.println(number+" ");
        numberPrint(number-1);
        System.out.println(number+" ");
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        numberPrint(n);
    }
}