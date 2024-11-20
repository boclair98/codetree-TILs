import java.util.Scanner;
public class Main {
    public static int tsn(int a, int b){
        int total = 0 ;

        for(int i =a; i<=b; i++){
            if (i % 3 == 0){
                total++;
            }else{
                if(i%10 == 3 || i % 10 == 6 || i%10 == 9){
                    total++;
                }else if(i / 10 == 3 || i /10 == 6 || i /10 == 9){
                    total++;
                }
            }
        }
        return total;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(tsn(a,b));
    }
}