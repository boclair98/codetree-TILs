import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();

        String[] word = new String[101];

        for(int i = 1 ; i<=n; i++){
            word[i] = sc.next();
        }

        int len_t = t.length();
        int cnt = 1 ;

        String[] word2 = new String[100];

        for (int i = 1; i<=n; i++){
            if (word[i].substring(0,len_t).equals(t)){
                word2[cnt] = word[i];
                cnt++;
            }
        }

        Arrays.sort(word2,1,cnt);

        System.out.print(word2[k]);
        
    }
}