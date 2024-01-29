import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int[] student = new int [n];

        for(int i = 0 ; i < n ; i++){
            student[i] = sc.nextInt();
        }
        Arrays.sort(student);
        int coin = 0 ;
        int index = 0;
        while (true){
            
            coin = coin + student[index];
            
            if (coin > p ){
                coin = coin - (student[index] / 2);
                if (coin <= p){
                    break;
                }
                
            }
            if (index == n-1){
                break;
            }
            index++;
        }
        System.out.print(index + 1);
    }
}