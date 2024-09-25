import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        //영어점수와 상관없이 수학점수가 높은 학생 이름 출력
        //수학점수가 같다면 영어점수가 높은 학생이 이름 출력
        Scanner sc = new Scanner(System.in);
        int firmath = sc.nextInt();
        int firen = sc.nextInt();

        int secmath = sc.nextInt();
        int secen = sc.nextInt();

        if(firmath>secmath){
            System.out.println("A");
        } else if((firmath == secmath)){
            if(firen>secen){
                System.out.println("A");
            }else{
                System.out.println("B");
            }
        }
        else{
            System.out.println("B");
        }
        
    }
}