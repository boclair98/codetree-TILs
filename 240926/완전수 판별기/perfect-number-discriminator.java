import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int start = 1;
        while (true){
            if(start == n){
                System.out.print("P");
                break;
            }else if(start>n){
                System.out.print("N");
            }else{
                start++;
            }
        }
    }
}