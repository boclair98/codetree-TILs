import java.util.Scanner;
public class Main {
    public static String add(int num,int num2){
        return num +" + "+num2+" = "+(num + num2);
    }

    public static String minus(int num,int num2){
        return num +" - "+num2+" = "+(num - num2);
    }

    public static String adx(int num,int num2){
        return num +" * "+num2+" = "+(num * num2);
    }

    public static String div(int num,int num2){
        return num +" / "+num2+" = "+(num / num2);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char b = sc.next().charAt(0);
        int c = sc.nextInt();

        if(b =='+'){
            System.out.print(add(a,c));
        } else if(b =='-'){
            System.out.print(minus(a,c));
        } else if( b =='*'){
            System.out.print(adx(a,c));
        }else if(b =='/'){
            System.out.print(div(a,c));
        }else{System.out.print("False");}
    }
}