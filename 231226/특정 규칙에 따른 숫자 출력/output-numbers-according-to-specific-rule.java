import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tal = 1;
        for(int i = 0; i<n; i++){

            
            for(int k = 0; k<i; k++){
                System.out.print("  ");
            }

            for(int x = 0 ; x<n-i;x++){
                if(tal >9){
                tal = 1;
            }
                System.out.print(tal+" ");
                tal++;
                
            }
            
            System.out.println();
        }
    }
}