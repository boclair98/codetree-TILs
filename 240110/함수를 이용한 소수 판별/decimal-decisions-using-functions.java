import java.util.Scanner;

public class Main {
    public static int sosu(int z,int x){
        int tal = 0 ;
        boolean so = false;
        for (int i = z ; i<=x; i++){
            int cnt = 0 ;
            for(int j=1; j<z; j++){
                if(i%j == 0){
                    cnt++;
                }

            }
            if (cnt == 1){
                tal = tal+ i;
            }
        }
                    
        return tal;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(sosu(a,b));
    }
}