import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int total = 0 ;
        for(int i = 0; i<num.length(); i++){
            total = total * 2 + (num.charAt(i)-'0');
        }
        System.out.println(total);
        
    }
}