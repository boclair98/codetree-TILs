import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char word = sc.next().charAt(0);

        if (word=='z'){
            System.out.print('a');
        }
        else{
            int tal = (int) word +1;
            char tal2 =(char ) tal;
            System.out.print(tal2);
        }

    }
}