import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i<n; i++){
            for(int t= n-i; t<n; t++){
                System.out.print("  ");
            }   
            for(int k = 0; k<(2*(n-i) -1); k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int x = 1; x<n; x++){
            for(int z = n-x; z>1; z--){
                System.out.print("  ");
            }
            for(int y = 0; y<(2*x+1); y++){
                System.out.print("* ");
            }
            System.out.println();
        }
        }
    }