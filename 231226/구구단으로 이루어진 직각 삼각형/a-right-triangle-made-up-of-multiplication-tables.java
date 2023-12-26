import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i<n; i++){

            for(int k = 1; k<=n-i ; k++){
                if (k<n-i){
                    System.out.print(i+1+" * "+k+" = "+((i+1)*k)+" / ");
                }
                else{
                    System.out.println(i+1+" * "+k+" = "+((i+1)*k));
                }
                
            }
        }
    }
}