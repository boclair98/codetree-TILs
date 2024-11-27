import java.util.*;
class product{
    String name;
    int code;

    product(){
        this.name ="codetree";
        this.code = 50;
    }
    product(String name, int code){
        this.name = name;
        this.code = code;
    }
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        product first = new product();
        System.out.println("product "+first.code+" is "+first.name);
        String name = sc.next();
        int code = sc.nextInt();
        product second = new product(name,code);
        System.out.println("product "+second.code+" is "+second.name);
    }
}