import java.util.Scanner;
class student{
    char alpha;
    int num;

    public student(char alpha,int num){
        this.alpha = alpha;
        this.num = num;
    }
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        student[] exam = new student[5];

        for(int i = 0 ; i<5; i++){
            char alpha = sc.next().charAt(0);
            int num = sc.nextInt();

            exam[i] = new student(alpha,num); 
        }

        int mindex = 0 ;

        for(int i = 1 ; i<5; i++){
            if (exam[mindex].num > exam[i].num){
                mindex = i;
            }
        }
        System.out.print(exam[mindex].alpha+" "+exam[mindex].num);
    }
}