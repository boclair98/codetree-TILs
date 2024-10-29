import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String alpha = sc.next();

        for (int i = 0 ; i<alpha.length(); i++){
            char s = alpha.charAt(i);
            if(s == 'L'){
                word = word.substring(1,word.length()) + word.substring(0,1);
            } else if(s == 'R'){
                word = word.substring(word.length()-1,word.length()) + word.substring(0,word.length()-1);
            }
        }
        System.out.print(word);
    }
}