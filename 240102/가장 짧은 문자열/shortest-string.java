import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int max_val = 0 ;
        int min_val = 21;

        for(int i= 0 ; i<3; i++){
            String word = sc.next();
            if (word.length()>max_val){
                max_val = word.length();
            }
            if (word.length()<min_val){
                min_val = word.length();
            }
        }
        System.out.print(max_val- min_val);
    }
}