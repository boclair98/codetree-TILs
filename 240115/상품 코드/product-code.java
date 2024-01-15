import java.util.Scanner;

class product{
    String name ;
    int num ;
    public product(String name,int num){
        this.name = name;
        this.num = num;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int num = sc.nextInt();

        product people = new product(name,num);

        System.out.println("product 50 is codetree");
        System.out.println("product "+people.num+" is "+people.name);
        
    }
}