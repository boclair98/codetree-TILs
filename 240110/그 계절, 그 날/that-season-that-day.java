import java.util.Scanner;
public class Main {

    public static boolean yoounun(int k){
        if (k>=1 && k<=3000){
            if (k%4 !=0){
                return false;
            }
            else if(k%100 !=0){
                return true;

            }
            else if(k%400!=0){
                return false;
            }
            else{
                return true;
            }
    }
    return false;
}

   public static int nowday1(int y, int m) {
        if (m == 2) {
            if (yoounun(y)) {
                return 29;
            } else {
                return 28;
            }
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            return 30;
        } else {
            return 31;
        }
    }

    public static String nowday(int y, int m, int d){
        if ((m>=3 &&m<=5) && ( d<= nowday1(y,m))){
            return "Spring";
        }
        if ((m>=6 && m<=8) && ( d<= nowday1(y,m))){
            return "Summer";
        }
        if ((m>=9 &&m<=11) && ( d<= nowday1(y,m))){
            return "Fall";
            
        }
        if ((m>=12 || m<=2) && ( d<= nowday1(y,m))){
            return "Winter";
        }
        return "-1";
    }



    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        System.out.print(nowday(y,m,d));
    }
}