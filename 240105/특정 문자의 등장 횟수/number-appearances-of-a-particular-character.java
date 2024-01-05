import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int cnt1 = 0 ;
        int cnt2= 0 ;

        for(int i = 1 ; i<word.length(); i++){
            if (word.charAt(i-1)=='e' && word.charAt(i)=='e'){
                cnt1++;
            }
            else if (word.charAt(i-1)=='e' && word.charAt(i)=='b'){
                cnt2++;
            }
        }
        System.out.print(cnt1+" "+cnt2);
    }
}