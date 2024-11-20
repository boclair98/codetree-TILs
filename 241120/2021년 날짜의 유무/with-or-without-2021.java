import java.util.Scanner;
public class Main {
    public static int day(int m){
        if ( m == 2){
            return 28;
        } else if(m == 4 || m == 6 || m == 9 || m == 11 ){
            return 30;
        }
        return 31;
    }

    public static boolean month(int n){
        if (n == 2){
            if (1>=day(n) && day(n)<=28){
                return true;
            }
        }else if( n == 4 || n == 6 || n == 9 || n==11 ){
            if (1>=day(n) && day(n)<=30){
                return true;
            }
        } else if(n == 1 || n == 3 || n== 5 || n==7 || n ==8 || n ==10 || n==12){
            if (1>=day(n) && day(n)<=31){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();

        if (month(m)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}