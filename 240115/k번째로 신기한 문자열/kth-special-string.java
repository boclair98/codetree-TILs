import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();

        String[] word = new String[n];

        for (int i = 0; i < n; i++) {
            word[i] = sc.next();
        }

        int len_t = t.length();
        int cnt = 0;

        String[] word2 = new String[n];

        for (int i = 0; i < n; i++) {
            if (word[i].substring(0, len_t).equals(t)) {
                word2[cnt] = word[i];
                cnt++;
            }
        }

        Arrays.sort(word2, 0, cnt);

        if (k >= 1 && k <= cnt) {
            System.out.print(word2[k - 1]);
        } 
    }
}