import java.util.Scanner;
public class Main {
    public static final int INT_MAX = Integer.MAX_VALUE;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];

        for(int i = 0 ; i<n; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        int minDist = INT_MAX;
        for(int i = 0; i<n; i++){
            int x_tal = x[i];
            int y_tal = y[i];

            for (int j = 0; j<n; j++){
                if (i == j){
                    continue;
                }
                int x_tal2 = x[j];
                int y_tal2 = y[j];
                minDist = Math.min(minDist, Math.abs((x_tal -x_tal2)) *  Math.abs((x_tal -x_tal2))  + Math.abs((y_tal -y_tal2))  * Math.abs((y_tal -y_tal2)));

            }
        }
        System.out.print(minDist);
    }
}