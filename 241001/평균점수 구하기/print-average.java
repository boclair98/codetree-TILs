import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        double total = 0 ;

        for(int i = 0 ; i<8; i++){
            total+=sc.nextDouble(); 
        }
        double avg = (double) total / 8;
        System.out.printf("%.1f",avg);
    }
}