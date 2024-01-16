import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
class Student{
    String name;
    int height;
    double weight;

    public Student(String name,int height,double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        Student[] peo = new Student[5];

        for(int i = 0 ; i<5; i++){
            String name = sc.next();
            int height = sc.nextInt();
            double weight = sc.nextDouble();

            peo[i] = new Student(name,height,weight);
        }
            Arrays.sort(peo,new Comparator<Student>(){
                public int compare(Student a, Student b){
                    return a.name.compareTo(b.name);
                }
            });
        
        System.out.println("name");
        for (int i = 0; i<5; i++){
            System.out.print(peo[i].name+" ");
            System.out.print(peo[i].height+" ");
            System.out.printf("%.1f",peo[i].weight);
            System.out.println();
            }
        System.out.println();
        System.out.println("height");
        Arrays.sort(peo,new Comparator<Student>(){
            public int compare(Student a, Student b){
                return b.height - a.height;
            }
        });

        for (int i = 0; i<5; i++){
            System.out.print(peo[i].name+" ");
            System.out.print(peo[i].height+" ");
            System.out.printf("%.1f",peo[i].weight);
            System.out.println();
            }
        



    }
}