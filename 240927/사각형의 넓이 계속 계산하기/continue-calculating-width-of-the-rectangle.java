import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        while (true){
            int n = sc.nextInt();
            int x = sc.nextInt();
            char c = sc.next().charAt(0);
            if(c =='C'){
                System.out.print(x*n);
                break;
            }else{
                System.out.println(x*n);
            }
        }
    }
}