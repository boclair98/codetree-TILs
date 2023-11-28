import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char a1 = sc.next().charAt(0);
        int a1_1 = sc.nextInt();

        char a2 = sc.next().charAt(0);
        int a2_1 = sc.nextInt();

        char a3 = sc.next().charAt(0);
        int a3_1 = sc.nextInt();

        if (a1 =='Y' && a1_1>=37){
            if ((a2=='Y'&& a2_1>=37) ||(a3=='Y'&& a3_1>=37)) {
                System.out.println("E");
            }
            else{
                System.out.println("N");
            }
        }
        else{
            if ((a2 =='Y' && a2_1>=37) && (a3=='Y'&& a3_1>=37)) {
                System.out.println("E");
            }
            else{
                System.out.println("N");
            }

        }
    }
}