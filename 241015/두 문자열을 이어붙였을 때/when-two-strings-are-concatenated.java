import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String aa = a+b;
        String bb = b+a;
        if(aa.equals(bb)){
            System.out.print("true");
        }else{
            System.out.print("false");
            
        }
    }
}