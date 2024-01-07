import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        System.out.println(word);
        for(int i = 0 ; i<word.length(); i++){
            word = word.substring(word.length()-1) + word.substring(0,word.length()-1);
            System.out.println(word);
        }
    }
}