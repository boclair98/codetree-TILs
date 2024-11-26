import java.util.*;
public class Main {
    public static void re1(int count){
        if (count == 0){
            return;
        }
        re1(count-1);
        System.out.print(count+" ");
    }
    public static void re2(int count){
        if(count == 0){
            return;
        }
        System.out.print(count+" ");
        re2(count-1);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        re1(n);
        System.out.println();
        re2(n);

    }
}