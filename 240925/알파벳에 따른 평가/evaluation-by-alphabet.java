import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        if (s.equals("S")){
            System.out.print("Superior");
        }else if(s.equals("A")){
            System.out.print("Excellent");
        }else if(s.equals("B")){
            System.out.print("Good");
        }else if(s.equals("C")){
            System.out.print("Usually");
        }else if(s.equals("D")){
            System.out.print("Effort");
        }
    }
}