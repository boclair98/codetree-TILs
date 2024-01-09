import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        for (int i = 0; i<word.length(); i++){
            if (word.charAt(i)>='a' && word.charAt(i)<='z'){
                int tal = (int) (word.charAt(i)-32);
                System.out.print((char)tal); 
            }
            else if(word.charAt(i)>='A'&&word.charAt(i)<='Z'){
                System.out.print(word.charAt(i));
            }
        }
    }
}