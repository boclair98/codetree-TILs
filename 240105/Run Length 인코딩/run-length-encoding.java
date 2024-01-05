import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        char start_word = word.charAt(0);
        String fi = "" ;
        int cnt = 1;

        for (int i = 1 ; i<word.length(); i++){
            if (word.charAt(i) == start_word){
                cnt++;
            }
            else{
                fi+=start_word;
                fi+=Integer.toString(cnt);
                start_word = word.charAt(i);
                cnt = 1;
            }


        }
        fi+=start_word;
        fi+=Integer.toString(cnt);
        System.out.println(fi.length());
        System.out.println(fi);
    }
}