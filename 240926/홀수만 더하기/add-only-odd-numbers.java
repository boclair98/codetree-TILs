import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;
        for (int i = 0; i<n; i++){
            int s = sc.nextInt();
            if(s%2 == 1 && s%3==0){
                total+=s;
            }
        }
        System.out.print(total);

    
    }
}