import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for(int i = 0 ; i<n; i++){
            s[i] = sc.next();
        }
        char a = sc.next().charAt(0);
        int total = 0 ;
        int len = 0;

        for(int i = 0 ; i<n; i++){
            if(s[i].charAt(0)==a){
                total++;
                len+=s[i].length();
            }
        }
        double avg = (double) len / total;
        System.out.printf("%d %.2f",total,avg);
    }
}