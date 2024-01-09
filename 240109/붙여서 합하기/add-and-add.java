import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();

        String word3 =word1+word2;
        int tal = Integer.parseInt(word3);
        String word4 = word2+ word1;

        int tal2 = Integer.parseInt(word4);

        System.out.print(tal+tal2);
        
    }
}