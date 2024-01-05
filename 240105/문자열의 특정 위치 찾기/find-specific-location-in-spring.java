import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        char word2 = sc.next().charAt(0);
        int cnt = -1 ;
        for (int i = 0; i<word.length(); i++){
            if (word.charAt(i)==word2){
                cnt=i;
                break;
            }
        }
        if (cnt>=0){
            System.out.print(cnt);
        }
        else{
            System.out.print("No");
        }
    }
}