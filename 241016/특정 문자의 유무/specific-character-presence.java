import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        boolean request = false;
        boolean request1 = false;

        for(int i = 0 ; i<s.length()-1; i++){
            if(s.charAt(i)=='e' && s.charAt(i+1)=='e'){
                request = true;
            }
            if(s.charAt(i)=='a' && s.charAt(i+1)=='b'){
                request1 = true;
            }
        }
        if(request==true){
            System.out.print("Yes ");
        }else{
            System.out.print("No ");
        }

        if(request1 == true){
            System.out.print("Yes ");
        }else{
            System.out.print("No ");
        }
    }
}