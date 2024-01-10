import java.util.Scanner;
public class Main {

    public static String gal(int a){

        int cnt = 0 ;
        if(a%2==0){
            cnt++;
        }

        if(((a/10) + (a%10)) % 5 == 0){
            cnt++;

        }

        if (cnt  == 2){
            return "Yes";
        }
        else{
            return "No";
        }

    }



    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(gal(n));
    }
}