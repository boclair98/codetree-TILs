import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String number= "";
        for(int i = 0 ; i<n; i++){
            number+=sc.next();
        }
        for (int i = 1; i<=number.length(); i++){
            System.out.print(number.charAt(i-1));
            if(i%5 == 0){
                System.out.println();
            }
        }
    }
}