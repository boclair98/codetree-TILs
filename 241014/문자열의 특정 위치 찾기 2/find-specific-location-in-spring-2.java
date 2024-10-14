import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char chr = sc.next().charAt(0);
        String[] f = {"apple","banana","grape","blueberry","orange"};
        int total = 0 ;
        for(int i = 0 ; i<f.length; i++){
            if (f[i].charAt(2)==chr || (f[i].charAt(3))==chr ){
                total++;
                System.out.println(f[i]);
            }
        }
        System.out.print(total);
    }
}