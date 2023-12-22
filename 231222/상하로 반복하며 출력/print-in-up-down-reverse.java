import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();

        int tal = n + 1;

        for(int i = 1; i<=n; i++){

            for(int j = 0; j<n; j++){
                if (j%2==0){
                    System.out.print(i);
                }
                else{
                    System.out.print(tal - 1);
            
                }
            }
            tal = tal - 1;
            System.out.println();
        }
            


        
    }
}