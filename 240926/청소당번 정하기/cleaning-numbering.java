import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int classroom = 0 ;
        int bok = 0;
        int bath = 0;
        for(int i = 1 ; i<=n; i++){
            if (i%2 == 0){
                classroom++;
            }
            if(i%3==0){
                bok++;
            }
            if(i%12==0){
                bath++;
            }
        }
        System.out.print(classroom+" "+bok+" "+bath);
    }
}