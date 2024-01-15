import java.util.Scanner;
import java.util.Arrays;
class human implements Comparable<human>{
    String name;
    int ki,age;

    public human(String name, int ki, int age){
        this.name = name;
        this.ki = ki;
        this.age = age;
    }

    public int compareTo(human human1){
        return this.ki - human1.ki;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 여기에 코드를 작성해주세요.
        
        int n = sc.nextInt();
        human[] people = new human[n];
        for(int i = 0 ; i<n; i++){
            String name = sc.next();
            int ki = sc.nextInt();
            int age = sc.nextInt();

            people[i] = new human(name,ki,age);
        }
        Arrays.sort(people);

        for(int i = 0 ; i<n; i++){
            System.out.println(people[i].name+" "+people[i].ki+" "+people[i].age);
        }

        
    }
}