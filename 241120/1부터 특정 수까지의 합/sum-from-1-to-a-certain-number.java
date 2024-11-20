import java.util.Scanner;
public class Main {
    public static int add(int num){
        int total = 0 ;

        for(int i =1; i<=num; i++){
            total+=i;
        }
        return total / 10 ;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(add(n));
    }
}