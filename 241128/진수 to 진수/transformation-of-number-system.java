import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String c = sc.next();
        int[] arr = new int[1000];
        int idx = 0 ;
        int total = 0 ;

        for(int i = 0; i<c.length(); i++ ){
            total = 8 * total + (c.charAt(i) -'0');
        }
        
        while(true){
            if(total < b){
                arr[idx++] = total;
                break;
            }
            arr[idx++] = total % b;
            total = total /b;
        }

        for(int i = idx-1; i>=0; i--){
            System.out.print(arr[i]+"");
        }

    }
}