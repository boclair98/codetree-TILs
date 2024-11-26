import java.util.*;
public class Main {
    public static void star(int count){
        if(count == 0){
            return;
        }
        star(count-1);
        for(int i = 0; i<count; i++){
            System.out.print("*");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        star(n);
    }
}