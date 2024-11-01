import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char word = sc.next().charAt(0);
        int num = sc.nextInt();

        int after_word = (int) word;
        char after_num = (char) num;
        System.out.print(after_word+" "+after_num);
    }
}