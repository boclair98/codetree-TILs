import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0; i<n; i++){
            for(int j = 1 ;j<=n-i; j++){
                if(j == (n-i)){
                    System.out.println((i+1)+" * "+j+" = "+((i+1)*j));
                }else{
                    System.out.print((i+1)+" * "+j+" = "+((i+1)*j)+" / ");
                }
            }
        }
    }
}