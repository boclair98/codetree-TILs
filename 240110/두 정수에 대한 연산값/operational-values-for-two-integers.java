import java.util.Scanner;
public class Main {
    public static void min_max (int x, int y){
        if (x>y){
            x = x+25;
            y = y*2;
        }
        else{
            x = x*2;
            y = y+25;
        }
        System.out.print(x+" "+y);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        min_max(a,b);

    }
}