import java.util.Scanner;
class human{
    String name;
    int level;
    public human(String name, int level){
        this.name = name;
        this.level = level;
    }
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        human first = new human("codetree",10);
        System.out.println("user "+first.name+" lv "+first.level);
        String w = sc.next();
        int le = sc.nextInt();
        human second = new human(w,le);
        System.out.println("user "+second.name+" lv "+second.level);
    }
}