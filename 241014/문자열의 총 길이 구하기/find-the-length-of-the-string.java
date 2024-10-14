import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[10];
        int total = 0 ;
        for(int i = 0 ; i<10; i++){
            arr[i] = sc.next();
            total+=arr[i].length();
        }
        System.out.print(total);
    }
}