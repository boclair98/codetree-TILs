import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        for (int i = 0 ; i<10; i++){
            String word = sc.next();
            if (word.equals("END")){
                break;
            }

            for (int j = word.length()-1 ; j>=0; j--){
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }
    }
}