import java.util.*;
public class Main {
    public static int n,m,k;
    public static int[] student;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();
        student = new int[n+1];
        boolean check = false;
        while(m>0){
            int number = sc.nextInt();
            student[number]++;
            if(student[number]>=k){
                System.out.print(number);
                check = true;
                break;
            }
        }
        if(!check){
        System.out.print(-1);
        }
    }
}