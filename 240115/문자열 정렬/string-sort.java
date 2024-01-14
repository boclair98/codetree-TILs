import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        char[] words = word.toCharArray();
        Arrays.sort(words);
        String tal = new String(words);

        for (int i = 0; i<tal.length(); i++){
            System.out.print(tal.charAt(i)+"");
        }
    }
}