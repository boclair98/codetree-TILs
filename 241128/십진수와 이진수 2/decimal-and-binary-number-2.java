import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int idx = 0;
        int number = 0;

        for(int i = 0 ; i<num.length(); i++){
            number = number * 2 +(num.charAt(i)-'0');
        }
        int total = number * 17;

        int[] arr = new int[1000];

        while (true){
            if (total < 1){
                break;
            }
            arr[idx++] = total % 2;
            total = total / 2 ;
        }
        for(int i = idx-1; i >=0; i--){
            System.out.print(arr[i]+"");
        }
    }
}