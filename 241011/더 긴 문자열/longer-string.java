import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ss = sc.next();
        if(s.length()>ss.length()){
            System.out.print(s+" "+s.length());
        }else if(s.length()<ss.length()){
            System.out.print(ss+" "+ss.length());
        }else{
            System.out.print("same");
        }
    }
}