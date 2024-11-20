import java.util.Scanner;
public class Main {

    public static boolean issosu(int num){
        boolean iss = true;
        if (num == 1){
            return true;
        }

        for(int i =2; i<num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int total = 0 ;
        for(int i =a; i<=b; i++){
            if(issosu(i)){
                total+=i;
            }
        }
        System.out.print(total);
    }
}