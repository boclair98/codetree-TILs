import java.util.Scanner;
public class Main {
    public static boolean yun(int a){
        if (a%4==0){
            return true;
        }
        else if( a% 100 == 0){
            return false;
        }
        else if(a%400==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(yun(n));
    }
}