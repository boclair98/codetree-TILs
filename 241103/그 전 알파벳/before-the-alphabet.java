import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char word = sc.next().charAt(0);
        if(word =='a'){
            System.out.print('z');
        }else{
            int word1 = (int) word - 1;
            System.out.print((char)word1);
        }
    }
}