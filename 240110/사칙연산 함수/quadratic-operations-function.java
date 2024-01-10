import java.util.Scanner;
public class Main {
    public static int plus(int a,int b){
        return a+b ; 
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char b = sc.next().charAt(0);
        int c = sc.nextInt();

        if (b =='+'){
            System.out.print(a+" + "+b+" = "+plus(a,c));
        }
        else if (b =='*'){
            System.out.print(a+" * "+c+" = "+a*c);
        }
        else if (b =='-'){
            System.out.print(a+" - "+c+" = "+a+c);
        }
        else if (b =='/'){
            System.out.print(a+" / "+c+" = "+a/c);
        }
        else{
            System.out.print("false");
        }
    }
}