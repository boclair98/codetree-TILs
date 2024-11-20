import java.util.Scanner;
public class Main {
    public static boolean sosu(int num){
        if (num == 1){
            return false;
        }
        for(int i=2; i<num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static boolean number(int number){
        if ((number / 10 + number % 10) % 2 == 0){
            return true;
        } 
        return false;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int total = 0 ;
        for(int i =a; i<=b; i++){
            if(sosu(i)){
                if(number(i)){
                    total++;
                }
            }
        }
        System.out.println(total);
    }
}