import java.util.Scanner;
class color{
    String name;
    char word;
    int num;

    public color(String name, char word, int num){
        this.name = name;
        this.word = word;
        this.num = num;
    }
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        String name = sc.next();
        char word = sc.next().charAt(0);
        int num = sc.nextInt();

        color w = new color(name,word,num);

        System.out.println("code : "+w.name);
        System.out.println("color : "+w.word);
        System.out.println("second : "+w.num);
    }
}