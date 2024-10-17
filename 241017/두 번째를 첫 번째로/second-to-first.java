import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char word = s.charAt(1);
        for (int i = 0 ; i<s.length(); i++){
            if(s.charAt(i)==word){
                System.out.print(s.charAt(0));
            }else{
                System.out.print(s.charAt(i));
            }
        }
    }
}