import java.util.Scanner;
public class Main {

    public static boolean snum(int n){
        if(n % 2 == 0){
            if((n /10 + n % 10 ) % 5 == 0){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(snum(n)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}