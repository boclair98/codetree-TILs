import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String word2 = sc.next();

        char[] word_1 = word.toCharArray();
        char[] word_2 = word2.toCharArray();
        word_2[0] =word_1[0];
        word_2[1] = word_1[1];

        for (int i = 0 ; i<word_2.length; i++){
            System.out.print(word_2[i]);
        }
    }
}