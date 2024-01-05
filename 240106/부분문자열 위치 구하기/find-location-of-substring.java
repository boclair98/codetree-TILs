import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String word2 =sc.next();
        int cnt = 0 ;
        for (int i = 1 ; i<word.length(); i++){
            if (word.charAt(i-1) == word2.charAt(0) && word.charAt(i)==word2.charAt(1)){
                cnt = i-1;
            }
        }
        if (cnt>=0){
            System.out.print(cnt);
        }
        else{
            System.out.print(-1);
        }
    }
}