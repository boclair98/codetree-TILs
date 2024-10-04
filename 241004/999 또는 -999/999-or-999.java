import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int max_value = 0 ;
        int min_value = Integer.MAX_VALUE;

        while(true){
            int n = sc.nextInt();
            if(n==999 || n == -999){
                break;
            }
            if(n>max_value){
                max_value = n ;
            }
            if(n<min_value){
                min_value = n ;
            }
        }
        System.out.print(max_value+" "+min_value);
    }
}