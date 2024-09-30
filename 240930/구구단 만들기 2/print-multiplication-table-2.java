import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = 2; i<=8; i++){
            if(i%2 == 0){
                for(int j =b; j>=a; j--){
                    if(j==a){
                        System.out.print(j+" * "+i+" = "+(j*i));
                    }else{
                        System.out.print(j+" * "+i+" = "+(j*i)+" / ");
                    }
                }
                System.out.println();
            }
        }
    }
}