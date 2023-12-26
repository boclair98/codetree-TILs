import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를   작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i<n; i++){
            int tal = 0;
            int k = sc.nextInt();
            int j = sc.nextInt();
            for(int x = k; x<=j; x++){
                if(x%2 == 0){
                    tal = tal + x;
                }
            }
            System.out.println(tal);

        }
    }
}