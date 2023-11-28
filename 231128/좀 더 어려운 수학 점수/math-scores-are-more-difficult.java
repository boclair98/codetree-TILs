import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        //영어점수와 상관없이 수학점수가 높은 학생 이름 출력
        //수학점수가 같다면 영어점수가 높은 학생이 이름 출력
        Scanner sc = new Scanner(System.in);
        int a_math = sc.nextInt();
        int a_eng = sc.nextInt();
        int b_math = sc.nextInt();
        int b_eng = sc.nextInt();
        if (a_math>b_math){
            System.out.println("A");
        }
        else if (b_math > a_math){
            System.out.println("B");
        }
        else if (b_math == a_math){
            if (a_eng>b_eng){
                System.out.println("A");
            }
            else{
                System.out.println("B");
            }
        }
        
    }
}