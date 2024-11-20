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

    public static boolean month(int m,int d){
        if(m<=12 && d<=day(m)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();

        if (month(m,d)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}