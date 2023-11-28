import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int age_1 = sc.nextInt();
        char sex_1 = sc.next().charAt(0);
        int age_2 = sc.nextInt();
        char sex_2 = sc.next().charAt(0);

        if ((age_1>=19 && sex_1=='M') || (age_2>=19 && sex_2=='M')){
            System.out.println(1);
        }
        else{
            System.out.println(0);       
        }
}
}