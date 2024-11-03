import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();
        String number ="";
        String number2="";

        for(int i = 0; i<num1.length(); i++){
            if(Character.isDigit(num1.charAt(i))){
                number+=num1.charAt(i);
            }
        }

        for(int i = 0; i<num2.length(); i++){
            if(Character.isDigit(num2.charAt(i))){
                number2+=num2.charAt(i);
            }
        }

        System.out.print(Integer.parseInt(number)+Integer.parseInt(number2));
    }
}