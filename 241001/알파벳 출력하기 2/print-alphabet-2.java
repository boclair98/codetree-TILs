import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int cnt = 65;
        for(int i = 0; i<n; i++){
            for(int j =0; j<i; j++){
                System.out.print("  ");
            }
            for(int k =i; k<n; k++){
                System.out.print((char)cnt+" ");
                if((char)cnt == 'Z'){
                    cnt = 65;
                }else{
                cnt++;
                }
            }
            System.out.println();
        }
    }
}