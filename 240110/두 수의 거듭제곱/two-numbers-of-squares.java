import java.util.Scanner;
public class Main {
    public static int fff(int a,int b){
        int tal = 1;

        for(int i = 0 ; i<b; i++){
            tal = tal * a;
        }
        return tal;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(fff(a,b));
    }
}