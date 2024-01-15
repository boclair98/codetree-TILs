import java.util.Scanner;
class student{
    String name;
    int age;

    public student(String name, int age){
        this.name = name;
        this.age = age;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 여기에 코드를 작성해주세요.
        String name = sc.next();
        int age = sc.nextInt();

        student Student = new student(name,age);

        System.out.println("user codetree lv 10");
        System.out.println("user "+Student.name+" lv "+Student.age);
        
    }
}