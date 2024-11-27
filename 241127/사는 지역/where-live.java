import java.util.*;
class student{
    String name;
    String number;
    String adress;

    student(String name, String number, String adress){
        this.name = name;
        this.number = number;
        this.adress = adress;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        student[] student = new student[n];
        for(int i = 0; i<n; i++){
            String name = sc.next();
            String number = sc.next();
            String adress = sc.next();
            student[i] = new student(name,number,adress);
        }
        int idx = 0;
        for(int i = 1; i<n; i++){
            if(student[i].name.compareTo(student[idx].name) > 0){
                idx = i;
            }
        }
        System.out.println("name "+student[idx].name);
        System.out.println("addr "+student[idx].number);
        System.out.println("city "+student[idx].adress);
        
        
        
    }
}