import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String word2 = sc.nextLine();
        
        for (int i = 0 ; i<word.length(); i++){
            if (word.charAt(i) != ' '){
                System.out.print(word.charAt(i));
            }
        }
        for (int i = 0 ; i<word2.length(); i++){
            if (word2.charAt(i) != ' '){
                System.out.print(word2.charAt(i));
            }
        }

    }
}