import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int tal = 0;
        for (int i = a; i<=b; i++){
            if(i%6==0 && i%8!=0){
                tal = tal + i;
            }
        }
        System.out.print(tal);
    }
}