import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int ag1 = sc.nextInt();
        String s1 = sc.next();

        int ag2 = sc.nextInt();
        String s2 = sc.next();

        if((ag1>=19 || ag2>=19) && (s1.equals("M") || s2.equals("M")) ){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
}
}