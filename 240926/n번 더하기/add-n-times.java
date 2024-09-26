import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a , n ;
        a = sc.nextInt();
        n = sc.nextInt();
        int start = 1;
        while (start<=n){
            a+=n;
            start++;
            System.out.println(a);
        }
        
}
}