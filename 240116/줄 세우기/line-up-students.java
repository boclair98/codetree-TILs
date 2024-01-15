import java.util.Scanner;
import java.util.Arrays;
class Student implements Comparable<Student>{
    int k,h,num;
    public Student(int k , int h, int num){
        this.k = k ;
        this.h = h ;
        this.num = num;
    }
    public int compareTo(Student student){
        if (this.k != student.k){
            return student.k - this.k;
        }
        if (this.h != student.h){
            return student.h -this.h;
        }
        return this.num - student.num;
    }
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] peo = new Student[n];

        for(int i =0; i<n; i++){
            int k = sc.nextInt();
            int h = sc.nextInt();
            peo[i] = new Student(k,h,i+1);
        }
        Arrays.sort(peo);

        for(int i = 0; i<n; i++){
            System.out.println(peo[i].k+" "+peo[i].h+" "+peo[i].num);
        }
    }
}