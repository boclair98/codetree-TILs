import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i<n; i++){

            for(int k = 0; k<n; k++){
                if (i==0){
                    System.out.print("* ");
                }

            }
           
            if (i!=0){
                for(int x = 0; x<i; x++){
                    System.out.print("* ");
                }
                for(int y = i+1; y<n; y++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}