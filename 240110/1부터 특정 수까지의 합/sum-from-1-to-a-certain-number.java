import java.util.Scanner;
public class Main {
    public static int rang(int a ){
        int tal = 0 ;
        for(int i = 1 ; i<=a; i++){
            tal = tal+i;
        }
        
        return tal / 10 ;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.print(rang(n));
    }
}