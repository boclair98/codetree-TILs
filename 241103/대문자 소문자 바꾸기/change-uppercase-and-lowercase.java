import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        for(int i = 0 ; i<word.length(); i++){
            if(word.charAt(i)>='a' && word.charAt(i)<='z'){
                System.out.print(Character.toUpperCase(word.charAt(i)));
            }else if(word.charAt(i)>='A' && word.charAt(i)<='Z'){
                System.out.print(Character.toLowerCase(word.charAt(i)));
            }
        }
    }
}