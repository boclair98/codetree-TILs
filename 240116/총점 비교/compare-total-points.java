import java.util.Scanner;
import java.util.Arrays;
class Student implements Comparable<Student>{
    String name;
    int kor,eng,math;

    public Student(String name,int kor,int eng,int math){
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int compareTo(Student student){
        return (this.kor+this.eng+this.math) - (student.kor+student.eng+student.math);
    }
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] peo = new Student[n];

        for(int i = 0 ; i<n; i++){
            String name = sc.next();
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int math = sc.nextInt();

            peo[i] = new Student(name,kor,eng,math);
        }
        Arrays.sort(peo);

        for(int i = 0 ; i<n; i++){
            System.out.println(peo[i].name+" "+peo[i].kor+" "+peo[i].eng+" "+peo[i].math);
        }
    }
}