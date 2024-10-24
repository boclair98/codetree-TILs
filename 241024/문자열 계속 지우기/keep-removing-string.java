import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String first_word = sc.next();
        String word = sc.next();
        int len = word.length();
        while (true){
            int length = first_word.length();
            boolean state = false; 
            if(first_word.indexOf(word)>=0){
                first_word = first_word.substring(0,first_word.indexOf(word)) +
                             first_word.substring(first_word.indexOf(word)+len);
                state = true ;
            }
            if (!state){
                System.out.println(first_word);
                break;
            }
        }

    }
}