import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int n = word.length();
        int cnt = 0 ;

        for(int i = 0 ; i<n; i++){
            for(int j = i+1; j<n; j++){
                if (word.charAt(i)=='(' && word.charAt(j)==')'){
                    cnt++;
                }
            }
        }
        System.out.print(cnt);


    }
}