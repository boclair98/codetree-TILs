import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr =new String[n];
        int total = 0 ;
        int cnt = 0 ;
        for(int i = 0 ; i<n; i++){
            arr[i]= sc.next();
            total+=arr[i].length();
            if(arr[i].charAt(0)=='a'){
                cnt++;
            }
        }
        System.out.print(total+" "+cnt);


    }
}