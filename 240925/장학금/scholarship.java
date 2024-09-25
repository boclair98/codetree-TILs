import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int fir = sc.nextInt();
        int sec = sc.nextInt();
        int total = 0;
        if(fir>=90){
            if(sec>=95){
                total+=100000;
            }else if(sec>=90){
                total+=50000;
            }
        }
        System.out.println(total);
    }
}