import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length();
        int count = 0;
        while (count<=len){
            System.out.println(s);
            s = s.substring(len-1,len)+s.substring(0,len-1);
            count++;
        }
    }
}