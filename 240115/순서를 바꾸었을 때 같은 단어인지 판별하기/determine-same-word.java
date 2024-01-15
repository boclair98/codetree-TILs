import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String word2 = sc.next();

        char[] word_val = word.toCharArray();
        Arrays.sort(word_val);

        String sortword_val = new String(word_val);

        char[] word_val2 = word2.toCharArray();
        Arrays.sort(word_val2);

        String sortword_val2 = new String(word_val2);

        if (sortword_val.equals(sortword_val2)){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }

    }
}