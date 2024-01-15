import java.util.Scanner;
class student{
    String name, alpha, age;

    public student(String name, String alpha, String age){
        this.name = name;
        this.alpha = alpha;
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 여기에 코드를 작성해주세요.
        String name = sc.next();
        String alpha = sc.next();
        String age = sc.next();
        student student1 = new student(name,alpha,age);
        System.out.println("secret code :"+" "+student1.name);
        System.out.println("meeting point :"+" "+student1.alpha);
        System.out.println("time :"+" "+student1.age);
    }
}