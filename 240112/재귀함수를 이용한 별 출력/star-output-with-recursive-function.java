import java.util.Scanner;
public class Main {
    public static void star(int k ){
        if ( k == 0){
            return ;
        }
        star(k-1);

        for(int i = 0 ; i<k; i++){
            System.out.print("*");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        star(n);

    }
}