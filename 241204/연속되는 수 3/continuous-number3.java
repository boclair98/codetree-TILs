import java.util.*;
public class Main {
    public static int n,total;
    public static int[] num = new int[2001];
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int reset = 1;

        for(int i = 0; i<n; i++){
            num[i] = sc.nextInt();
        }
        int max_val = 1 ;
        for(int i =1; i<n; i++){
            if(num[i-1]<0 && num[i]<0){
                reset++;
            } else if(num[i-1]>=0 && num[i]>=0){
                reset++;
            }
            else{
                if(reset>max_val){
                    max_val = reset;
                    reset = 1;
                    
                }
            }
        }
        System.out.println(max_val);

    }
}