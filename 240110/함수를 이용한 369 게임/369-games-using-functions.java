import java.util.Scanner;
public class Main {
    public static int num(int z, int x){
        int cnt = 0;
        for(int i = z; i<=x; i++){
            if (i%10==3 || i%10==6 || i%10 ==9){
                cnt++;
            }
            else if(i/10 ==3 || i/10 ==6 || i/10 ==9){
                cnt++;
            }
            else if (i%3==0){
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(num(a,b));
    }
}