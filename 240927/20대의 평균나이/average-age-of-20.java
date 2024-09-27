import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int cnt = 0 ;
        while (true){
            int age = sc.nextInt();
            if(age>=20 && age<30){
                total+=age;
                cnt++;
            }else{
                System.out.printf("%.2f",(double) total/cnt);
                break;
            }
        }
    }
}