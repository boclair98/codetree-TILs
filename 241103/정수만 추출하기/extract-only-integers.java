import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();

        String first ="";
        String second ="";
        for (int i = 0; i < num1.length(); i++){
            if (Character.isDigit(num1.charAt(i))){
                first+=num1.charAt(i);
            }else{
                break;
            }
        }
        for (int i = 0; i < num2.length(); i++){
            if (Character.isDigit(num2.charAt(i))){
                second+=num2.charAt(i);
            }else{
                break;
            }
        }
        System.out.print(Integer.parseInt(first)+Integer.parseInt
        (second));
    }
}