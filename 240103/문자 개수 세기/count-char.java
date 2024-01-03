import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        char word2 = sc.next().charAt(0);

        int cnt = 0 ;
        int len_word = word.length();
        for(int i = 0 ; i<len_word; i++){
            if (word2 == word.charAt(i)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}