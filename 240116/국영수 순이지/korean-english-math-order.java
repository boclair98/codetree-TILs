import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student>{
    String name ;
    int kor,math,eng;

    public Student(String name,int kor,int math,int eng){
        this.name = name;
        this.kor = kor;
        this.math = math;
        this.eng = eng;
    }

    public int compareTo(Student student){
        if (student.kor != this.kor){
            return student.kor - this.kor;
        }
        if (student.math!=this.math){
            return student.math - this.math;
        }
        return student.eng - this.eng;
    }
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Student[] human = new Student[n];

        for (int i = 0 ; i<n; i++){
            String name = sc.next();
            int kor = sc.nextInt();
            int math = sc.nextInt();
            int eng = sc.nextInt();
            human[i] = new Student(name,kor,math,eng);
        }

        Arrays.sort(human);

        for (int i = 0 ; i<n; i++){
            System.out.println(human[i].name+" "+human[i].kor+" "+human[i].math+" "+human[i].eng);
        }
    }
}