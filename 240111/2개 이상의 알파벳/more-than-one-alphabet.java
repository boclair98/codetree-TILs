import java.util.Scanner;
public class Main {
    public static boolean alph(String word){
        for (int i = 1 ; i<word.length(); i++){
            if (word.charAt(0) != word.charAt(i)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        if (alph(word)){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}