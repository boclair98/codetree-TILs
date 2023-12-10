import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int two = 0;
        int three=0;
        int twe = 0;
        int n = sc.nextInt();
        for (int i =1; i<=n; i++){
            if (i%12==0){
                twe+=1;
            }
            else if(i%3==0){
                three+=1;
            }
            else if (i%2==0){
                two+=1;
            }
        }
        System.out.print(two+" "+three+" "+twe);
    }

}