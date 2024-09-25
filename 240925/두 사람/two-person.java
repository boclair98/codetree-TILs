import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int ag1 = sc.nextInt();
        char s1 = sc.next().charAt(0);

        int ag2 = sc.nextInt();
        char s2 = sc.next().charAt(0);

        if((ag1>=19 || s1 =='M') && (ag2>=19 || s2=='M') ){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
}
}