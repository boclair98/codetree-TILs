import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tal =1;
        int start = 0;
        while (true){
            start =2*tal;
            if (start == n){
                System.out.print(tal);
                break;
            }
            
            tal = tal+1;

        }
    }
}