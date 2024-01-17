import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[201];
        String[] word = new String[201];
        int cur = 100;
        int right, left;

        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            char k1 = sc.next().charAt(0);

            if (k1 == 'R') {
                right = cur + k;
                left = cur;
                cur = right;
                for (int j = left; j < right; j++) {
                    num[j] += 1;
                    word[j] = "Black";
                }
            }

            if (k1 == 'L') {
                right = cur;
                left = cur - k;
                cur = left;
                for (int z = left; z < right; z++) {
                    num[z] += 1;
                    word[z] = "White";
                }
            }
        }

        for (int i = 0; i < 201; i++) {
            if (num[i] >= 4) {
                word[i] = "gray";
            }
        }

        int wh = 0;
        int bl = 0;
        int gr = 0;

        for (int i = 0; i < 201; i++) {
            if ("White".equals(word[i])) {
                wh++;
            }
            if ("Black".equals(word[i])) {
                bl++;
            }
            if ("gray".equals(word[i])) {
                gr++;
            }
        }

        System.out.print(wh + " " + bl + " " + gr);

        sc.close();
    }
}