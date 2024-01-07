import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        word = word.substring(1,word.length()) + word.substring(0,1);
        System.out.print(word);
    }
}