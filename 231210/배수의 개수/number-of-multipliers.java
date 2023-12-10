import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int thr=0;
        int fiv=0;
        for (int i = 1 ; i<=10; i++){
            int a = sc.nextInt();
            if(a%3==0){
                thr+=1;
            }
            if (a%5==0){
                fiv+=1;
            }
        }
        System.out.print(thr+" "+fiv);
    }
}