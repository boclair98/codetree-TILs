import java.util.Scanner;
public class Main {
    public static int day(int k){

        if (k==2){
            return 28;
        }
        else if (k==4 || k==6 || k==9||k==11){
            return 30;
        }
        return 31;
    }
    public static boolean didi(int a,int b){
        if (a<=12 && b<=day(a)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if (didi(n,m)){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}