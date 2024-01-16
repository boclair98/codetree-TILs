import java.util.Scanner;
import java.util.Arrays;
class Student implements Comparable<Student>{
    String name;
    int height,weight;
    public Student(String name,int height,int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
    public int compareTo(Student student){
        if (height!=student.height){
            return height - student.height;
        }
        return student.weight - weight;
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
            int height = sc.nextInt();
            int weight = sc.nextInt();
            peo[i] = new Student(name, height, weight);
        }
        Arrays.sort(peo);

        for (int i = 0; i<n; i++){
            System.out.println(peo[i].name+" "+peo[i].height+" "+peo[i].weight);
        }
    }
}