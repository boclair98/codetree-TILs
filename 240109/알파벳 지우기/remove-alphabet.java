import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String word2 = sc.next();

        String tal="";
        String tal2="";

        for (int i = 0 ; i<word.length(); i++){
            if (word.charAt(i)>='0' && word.charAt(i)<='9'){
                tal+=word.charAt(i);
            }
        }

        for (int i = 0 ; i<word2.length(); i++){
            if (word2.charAt(i)>='0' && word2.charAt(i)<='9'){
                tal2+=word2.charAt(i);
            }
        }

        int tal3 = Integer.parseInt(tal) + Integer.parseInt(tal2);
        System.out.print(tal3);
    }
}