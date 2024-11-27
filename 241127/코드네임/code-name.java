import java.util.*;
class student{
    char grade;
    int point;
    public student(char grade, int point){
        this.grade = grade;
        this.point = point;
    }
}
public class Main {
    private static char sco;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int min_score = Integer.MAX_VALUE;
        
        Scanner sc = new Scanner(System.in);
        student[] exam = new student[5];
        for(int i = 0; i<5; i++){
            char g = sc.next().charAt(0);
            int num = sc.nextInt();
            exam[i] = new student(g,num);
        }
        
        for(int i = 0; i<5; i++){
            if (min_score > exam[i].point){
                sco = exam[i].grade;
                min_score = exam[i].point;
            }
        }
        System.out.print(sco+" "+min_score);
    }
}