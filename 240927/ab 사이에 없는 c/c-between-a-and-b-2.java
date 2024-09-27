import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean state= false;

        for(int i=a; i<=b; i++){
            if(i%c == 0){
                state = true;
            }
        }

        if(state == true){
            System.out.print("NO");
        }else{
            System.out.print("YES");
        }
    }
}